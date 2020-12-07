package com.company;

import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.print("Enter amount:");
        int  Balance = T.nextInt();
        if ( Balance < 1000)
            System.out.println("Transaction can't be done due to RBI guidelines of maintaining minimum balance.");
        else
            System.out.println("Transaction completed successfully.");
    }
}
