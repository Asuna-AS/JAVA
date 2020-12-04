package com.company;

import java.util.Scanner;

public class takingInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1:");

        int a = sc.nextInt();

        System.out.print("Enter number 2:");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.print("The sum of these numbers is:");

        System.out.println(sum);
    }
}
