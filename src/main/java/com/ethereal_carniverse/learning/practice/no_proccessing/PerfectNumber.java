package com.ethereal_carniverse.learning.practice.no_proccessing;

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        boolean result = new PerfectNumber().checkPerfectNumber(num);

        if (result) {
            System.out.println("The number you entered is a perfect number");
        } else System.out.println("The number you entered is not a perfect number");

        scanner.close();
    }

    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}