package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_19_Sales_Commission_Calculator {
    public static void main(String[] args) {

        double nr1 = 239.99;
        double nr2 = 129.75;
        double nr3 = 99.95;
        double nr4 = 350.89;
        int weekSalary = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество проданного товара за эту неделю:");
        System.out.println("Количество товара nr1: ");
        int colNr1 = scanner.nextInt();
        System.out.println("Количество товара nr2: ");
        int colNr2 = scanner.nextInt();
        System.out.println("Количество товара nr3: ");
        int colNr3 = scanner.nextInt();
        System.out.println("Количество товара nr4: ");
        int colNr4 = scanner.nextInt();
        scanner.close();

        System.out.println("Количество проданного товара за эту неделю: ");
        System.out.println("Товар nr1 = " + colNr1);
        System.out.println("Товар nr2 = " + colNr2);
        System.out.println("Товар nr3 = " + colNr3);
        System.out.println("Товар nr4 = " + colNr4);
        double salaryPercent =(nr1 * colNr1 + nr2 * colNr2 + nr3 * colNr3 + nr4 * colNr4)*0.09;
        double totalSalary = weekSalary + salaryPercent;
        System.out.printf("Заработок продовца за эту неделю = %.2f%n", totalSalary);


    }
}
