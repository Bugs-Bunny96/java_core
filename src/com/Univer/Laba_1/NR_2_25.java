package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_25 {
    public static void main(String args[]) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        if (var % 2 == 0) {
            System.out.println("Число " + var + " четное");
        } else {
            System.out.println("Число " + var + " нечетное");
        }
    }
}

