package com.company;

import java.util.Scanner;

public class ResultBasedOnMerit {
    public static void main(String[] args) {
        System.out.println("Please enter your Grade:");
        Scanner sc = new Scanner(System.in);
        int studentGrade = sc.nextInt();
        if ( studentGrade>=33 )
            System.out.println("Passed");
        else
        System.out.println("Failed");

    }
}
