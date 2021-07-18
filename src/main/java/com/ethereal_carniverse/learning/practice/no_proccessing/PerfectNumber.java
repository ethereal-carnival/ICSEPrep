package com.ethereal_carniverse.learning.practice.no_proccessing;

import java.util.Scanner;

class PerfectNumber{
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int num, sum = 0;
                System.out.println("Enter a number : ");
                num = scanner.nextInt();
                
                for (int i = 1; i <= num/2; i++){
                    if (num%i == 0){
                    sum += i;
                }
        }
        if (sum==num){
            System.out.println("The number you entered is a perfect number");
        }
        else System.out.println("The number you entered is not a perfect number");
        scanner.close();
      }
}