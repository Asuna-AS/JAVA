
// ASSIGNMENT 2
package com.company;

public class ByteCasting {
    public static void main(String[] args) {
        byte  num = (byte)130;
        System.out.println(num);
    }
}


// so the upper limit for a byte is -128 to 127, 130 overflows the limit and we get -126, number from negetive side.
