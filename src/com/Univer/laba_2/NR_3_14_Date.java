package com.Univer.laba_2;

import java.util.Scanner;

public class NR_3_14_Date {
    public static void main(String[] args){

        DateTest date = new DateTest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения месяц.");
        date.setMonth(scanner.nextInt());
        System.out.println("Введите значения день.");
        date.setDay(scanner.nextInt());
        System.out.println("Введите значения год.");
        date.setYear(scanner.nextInt());

        System.out.printf(" Month: %d%n Day: %d%n Year: %d%n%n",
                date.getMonth(),date.getDay(),date.getYear());

        date.DisplayDate();

    }
}
