package com.test;

public class JoinTwoArrays {

    public static String[] joinTwoArrays(String[] array1, String[] array2) {
        String[] arrayJoined = new String[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayJoined[i] = array1[i];
        }
        for (int j = array1.length; j < arrayJoined.length; j++) {
            arrayJoined[j] = array2[j - array1.length];
        }
        return arrayJoined;
    }

    public static int[] joinTwoArrays(int[] array1, int[] array2) {
        int[] arrayJoined = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayJoined[i] = array1[i];
        }
        for (int j = array1.length; j < arrayJoined.length; j++) {
            arrayJoined[j] = array2[j - array1.length];
        }
        return arrayJoined;
    }

    public static Object[] joinTwoArrays(Object[] array1, Object[] array2) {
        Object[] arrayJoined = new Object[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arrayJoined[i] = array1[i];
        }
        for (int j = array1.length; j < arrayJoined.length; j++) {
            arrayJoined[j] = array2[j - array1.length];
        }
        return arrayJoined;
    }
}
