package com.Univer.laba_2;

import java.util.Scanner;

public class NR_3_16_HeartRates {
    public static void main(String[] args){

        HeartRates heartRates = new HeartRates();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Имя ");
        heartRates.setLastName(scanner.next());
        System.out.println("Введите Фамилию ");
        heartRates.setFirstName(scanner.next());
        System.out.println("Дата рождения.");
        System.out.println("Введите мясяц ");
        heartRates.setMonth(scanner.nextInt());
        System.out.println("Введите число ");
        heartRates.setDay(scanner.nextInt());
        System.out.println("Введите год ");
        heartRates.setYear(scanner.nextInt());

        System.out.printf("Имя: %s%nФамилия: %s%nВозраст:",heartRates.getLastName(),heartRates.getFirstName());

        heartRates.DisplayDate(); // вывод возвросто в годах

        heartRates.MaximumHeartRate(); // вывод Максимальной частоты пульса

        heartRates.TargetHeartRate(); // вывод целевой частоты пульса

    }
}
