package com.ethereal_carniverse.learning.utils;

public class NumberUtils {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (isFactor(i,  num)) {
                sum += i;
            }
        }
        return sum == num;
    }

    private static boolean isFactor(int numberToCheck, int num) {
        return num % numberToCheck == 0;
    }
}
