package com.Univer.laba_4;

import java.util.Scanner;

public class NR_5_16 {
    public static void main(String[] args) {

        int num;
        int num1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 digits, ranging from 1 to 30");

        while (true) {
            int tmp;
            tmp = scanner.nextInt();
            if (tmp > 0 && tmp < 31) {
                num = tmp;
                tmp = scanner.nextInt();
                if (tmp > 0 && tmp < 31) {
                    num1 = tmp;
                    break;
                }
            } else {
                System.out.println("Incorrect number! Enter 5 digits, ranging from 1 to 30");
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println("\n");
        for (int i = 0; i < num1; i++) {
            System.out.print("* ");
        }
    }
}
