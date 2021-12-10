package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_17 {
    public static void main(String args[]) {

        System.out.println("ВВедите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();

        System.out.println("ВВедите второе число: ");
        int var2 = scanner.nextInt();

        System.out.println("ВВедите третье число: ");
        int var3 = scanner.nextInt();

        int sum = var1 + var2 + var3;
        int average = (var1 + var2 + var3) / 3;
        int product = var1 * var2 * var3;
        int small;
        int largest;

        if (var1 <= var2 && var1 <= var3) {
            small = var1;
        } else if (var2 <= var3 && var2 <= var1) {
            small = var2;
        } else {
            small = var3;
        }

        if (var1 >= var2 && var1 >= var3) {
            largest = var1;
        } else if (var2 >= var3 && var2 >= var1) {
            largest = var2;
        } else {
            largest = var3;
        }

        System.out.println("Сумма чисел = " + sum);
        System.out.println("Среднее значение чисел = " + average);
        System.out.println("Произведение чисел = " + product);
        System.out.println("Наименьшее число = " + small);
        System.out.println("Наибольшее число = " + largest);

    }
}
