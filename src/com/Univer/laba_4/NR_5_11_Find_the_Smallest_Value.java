package com.Univer.laba_4;

import java.util.Scanner;

public class NR_5_11_Find_the_Smallest_Value {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значени которое определит количество вводимых значений:");
        while (true) {
            n = scanner.nextInt();
            if (n >= 1) {
                break;
            } else {
                System.out.println("Ошибка! Значение не иожет быть меньше '1' ");
            }
        }
        int[] arr = new int[n];

        System.out.println("Введите значения");
        for (int x = 0; x <= n - 1; x++) {
            arr[x] = scanner.nextInt();
        }

        int min = arr[0];
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] < min) {
                min = arr[counter];
            }
        }
        System.out.println("The largest number is: " + min);
    }
}
