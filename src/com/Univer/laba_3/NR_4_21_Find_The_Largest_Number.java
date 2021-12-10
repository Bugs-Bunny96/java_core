package com.Univer.laba_3;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class NR_4_21_Find_The_Largest_Number {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array of 10 numbers");

        for (int x = 0; x <= 9; x++) {
            arr[x] = scanner.nextInt();
        }

        for (int y = 0; y <= 9; y++) {
            System.out.println("array numbers[" + (y + 1) + "] is: " + arr[y]);
        }

        int max = arr[0];
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] > max) {
                max = arr[counter];
            }
        }
        System.out.println("The largest number is: " + max);

    }
}
