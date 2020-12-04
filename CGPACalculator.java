package com.company;

import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {

        System.out.println("Calculating cgpa using marks out of 100");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1:");

        int a = sc.nextInt();

        System.out.print("Enter marks of subject 2:");

        int b = sc.nextInt();

        System.out.print("Enter marks of subject 3:");

        int c = sc.nextInt();

        System.out.print("CGPA of student is:");

        int d = a+b+c;
        float cgpa =  d /30f;

        System.out.println(cgpa);

    }
}
