package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_15 {
    public static void main(String args[]) {

        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int var_1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int var_2 = scanner.nextInt();

        int sum = var_1 + var_2;
        int def = var_1 - var_2;
        double div = (double) var_1 / var_2;

        System.out.println("Сумма введеных чисел = :"+sum + "\nРазница введеных чисел = :"+def +
                "\nОстаток от деления введеных чисел = :"+div);
    }
}
