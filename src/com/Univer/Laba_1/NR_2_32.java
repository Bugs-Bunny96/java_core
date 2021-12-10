package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_32 {
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

        int plus = 0;
        int minus = 0;
        int zero = 0;

        if (var1 == 0) {
            zero++;
        } else if (var1 > 0)
            plus++;
        else
            minus++;
        if (var2 == 0) {
            zero++;
        } else if (var2 > 0)
            plus++;
        else
            minus++;
        if (var3 == 0) {
            zero++;
        } else if (var3 > 0)
            plus++;
        else
            minus++;
        if (var4 == 0) {
            zero++;
        } else if (var4 > 0)
            plus++;
        else
            minus++;
        if (var4 == 0) {
            zero++;
        } else if (var4 > 0)
            plus++;
        else
            minus++;

        System.out.println("Колличество положительных чисел = " + plus);
        System.out.println("Колличество отрицательных чисел = " + minus);
        System.out.println("Колличество нулей = " + zero);

    }
}
