package com.company;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of three numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = sc.nextInt();
        System.out.print("Enter number 2:");
        int b = sc.nextInt();
        System.out.print("Enter number 3:");
        int c = sc.nextInt();
        System.out.print("The sum of these three numbers is:");
        int sum = a+b+c;
        System.out.println(sum);

    }
}
