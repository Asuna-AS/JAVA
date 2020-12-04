package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the Year:");
        Scanner Y = new Scanner(System.in);
        int a = Y.nextInt();  // leap year is div by 4 and 400 but not by 100.
        boolean b = false;

        if (a % 4 == 0 ) {

            if ( a % 100 == 0){

                if (a % 400 == 0)

                    b= true;
                else

                    b=false;

            }
                            else
            b=true;


        }
                        else
        b=false;

        if (b)
            System.out.print(a + " is a leap year.");
        else
            System.out.print(a + " is not a leap year.");
    }
}
