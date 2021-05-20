package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    private static void removeDuplicates() throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("C:/1/0.txt")); //INPUT FILE
        FileWriter writer = new FileWriter("C:/1/00.txt"); //OUTPUT FILE
        Set<String> set = new TreeSet<>(); //используется TreeSet, чтобы сортировать резулатьты по алфавиту

        while (sc.hasNext()) {//если есть элементы
            sb.append(sc.next()).append("\n"); //добавление в StringBuilder каждое слово с новой строки
        }
        String replaceWith = "";//будет заменен на пустоту

        String digits [] = new String[10];//создание массива цифр, для их удаления из списка
        for (int i = 0; i < 10; i++) {
            digits[i] = String.valueOf(i);
        }

        String[] symbols = {"]", "[", "?", "!", " ", "–", "“", "”", "…", "«", "»", "—", ",", ".", ":", "=", ";", "-", "\"", "(", ")", "/", ">", "<", " "};//массив символов для удаления
        String[] replaceSymbols = JoinTwoArrays.joinTwoArrays(digits, symbols);//объединение массива цифр с массивом символов, для этого используется class JoinTwoArrays

        String txt = sb.toString().trim().toLowerCase().replace("\n\n","\n");//StringBuffer превращается в String, удаляется пробелы в начале и в конце, все буквы приводится в строчный вид, 2 абзаца заменятся на 1

        for (int j = 0; j < replaceSymbols.length; ) {
            txt = txt.replace(replaceSymbols[j++], replaceWith); // удаляем цифры и символы из текста
        }

        String[] array = txt.split("\n"); //создание массива по абзацам

        Collections.addAll(set, array); //массив добавляется в set, чтобы убрать дубликаты
        for (String s : set) {
            writer.append(s).append("\n");//записывается в файл
            System.out.println(s);
        }
        writer.flush();//закрывание файла
    }

    public static void main(String[] args) throws IOException {
        removeDuplicates();
    }
}