package com.ethereal_carniverse.learning.menu_based;

import java.util.Scanner;

public class Computron {

    public boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }

    // An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
    // For example, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371.
    public boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, 3);
            temp /= 10;
        }
        return sum == num;
    }

    public int countLetters(String sentence) {
        int length = sentence.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computron computron = new Computron();
        int choice;
        char executeAgain;

        do {

//            System.out.println("Hello, I am Computron. How may I help you today?");
//            System.out.println("1. Check if an input number is prime.");
//            System.out.println("2. Check if an input number is Armstrong.");
//            System.out.println("3. Count the number of letters in an input sentence.");
//            System.out.print("Choice: ");

            System.out.print("Hello, I am Computron. How may I help you today?\n1. Check if an input number is prime.\n2. Check if an input number is Armstrong.\n3. Count the number of letters in an input sentence.\nChoice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to check: ");
                    if (computron.isPrime(scanner.nextInt())) {
                        System.out.println("The number is prime.");
                    } else {
                        System.out.println("The number is not prime.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the number to check: ");
                    if (computron.isArmstrong(scanner.nextInt())) {
                        System.out.println("The number is Armstrong.");
                    } else {
                        System.out.println("The number is not Armstrong.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the sentence to check: ");
                    int numberOfLetters = computron.countLetters(scanner.nextLine());
                    System.out.println("There are " + numberOfLetters + " letters in the sentence.");
                    break;
                default:
                    break;
            }

            System.out.print("Do you want to check another number of sentence? Choice (y/n): ");
            String input = scanner.next();
            executeAgain = Character.toLowerCase(input.charAt(0));

        } while (executeAgain == 'y');
    }
}
