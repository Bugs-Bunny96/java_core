package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_35_Sides_of_a_Triangle {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1-е значение стороны треугольника:");
        a = scanner.nextInt();
        System.out.println("Введите 2-е значение стороны треугольника:");
        b = scanner.nextInt();
        System.out.println("Введите 3-е значение стороны треугольника:");
        c = scanner.nextInt();

        if (a + b > c && a + c > b && c + c > a) {
            System.out.println("Данные значения могут предоставлять стороны треугольника.");
        } else
            System.out.println("Данные значения не могут предоставлять стороны треугольника.");
    }
}
