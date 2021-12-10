package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_30_Palindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Enter a five-digit number.");
        while (true){
            value=scanner.nextInt();
            double tmp2= (double)value/10000;
            if(tmp2>1&&tmp2<10){
                break;
            }else
            System.out.println("Error! Incorrect number. Enter a five-digit number.");
        }
        System.out.println("Original number : " + " " + value);
        int tmp = value;
        int result = 0;
        while (tmp != 0) {
            result = result * 10 + (tmp % 10);
            tmp = tmp / 10;
        }
        System.out.println("Reversed Number : " + " " + result);
        if (result != value) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }

    }
}
