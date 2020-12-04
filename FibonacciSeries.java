package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.print("ENTER THE NUMBER OF TERMS:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a=0;

        int b=1;

         for (int i=1; i<=n; ++i)
         {
             System.out.print(a);
             int x = a + b;
             a = b;
             b = x;


         }





    }
}
