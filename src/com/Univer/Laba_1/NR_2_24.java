package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_24 {
    public static void main(String args[]) {

        System.out.println("Введите 1-е число");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        System.out.println("Введите 2-е число");
        int var2 = scanner.nextInt();
        System.out.println("Введите 3-е число");
        int var3 = scanner.nextInt();
        System.out.println("Введите 4-е число");
        int var4 = scanner.nextInt();
        System.out.println("Введите 5-е число");
        int var5 = scanner.nextInt();

        int small = 0;

        if (var1 < var2) {
            small = var1;
        } else {
            small = var2;
        }
        if (small > var3) {
            small = var3;
        }
        if (small > var4) {
            small = var4;
        }
        if (small > var5) {
            small = var5;
        }


        System.out.println("Наименьшее число = " + small);

        int largest = 0;
        if (var1 > var2) {
            small = var1;
        } else {
            small = var2;
        }
        if (small < var3) {
            small = var3;
        }
        if (small < var4) {
            small = var4;
        }
        if (small < var5) {
            small = var5;
        }
        System.out.println("Наибольшее число = " + largest);

    }
}
