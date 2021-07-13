package com.ethereal_carniverse.learning.utils;

public class NumberUtils {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (isFactor(i, num)) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return num == reverse;
    }

    public static boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }

    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }

    public static int factorial(int num) {
        return (num > 1) ? num * factorial(num - 1) : 1;
    }

    public static boolean isFactor(int potentialFactor, int num) {
        return num % potentialFactor == 0;
    }
}
