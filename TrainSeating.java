package com.company;

import java.util.Scanner;

public class TrainSeating {
    public static void main(String[] args) {


        System.out.print("Enter the seat number:");
        Scanner Sc = new Scanner(System.in);

        int s = Sc.nextInt();
        if (s % 6 == 0 || (s - 1) % 6 == 0) {
            if (s % 4 == 0) {
                System.out.println(s - 11);
            } else if (s % 4 == 1) {
                System.out.println(s + 11);

            } else if (s % 4 == 2) {
                System.out.println(s + 1);
            } else {
                System.out.println(s - 1);
            }
            System.out.println("WS");
        } else if ((s + 1) % 3 == 0) {
            if (s % 4 == 0) {
                System.out.println(s - 3);
            } else if (s % 4 == 1) {
                System.out.println(s + 3);

            } else if (s % 4 == 2) {
                System.out.println(s + 9);
            } else {
                System.out.println(s - 9);
            }
            System.out.println("MS");
        } else {
            if (s % 4 == 0) {
                System.out.println(s + 5);
            } else if (s % 4 == 1) {
                System.out.println(s - 5);

            } else if (s % 4 == 2) {
                System.out.println(s - 7);
            } else {
                System.out.println(s + 7);
            }
            System.out.println("AS");
        }
    }
}





