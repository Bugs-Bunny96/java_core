package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_16 {
    public static void main(String arg[]) {

        System.out.println("Введите 1-е число:");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();

        System.out.println("Ввеедите 2-е число:");
        int var2 = scanner.nextInt();

        if (var1 > var2) {
            System.out.println("Первое число " +var1+ " больше чем второе "+var2);
        }
        else if (var1 == var2) {
            System.out.println("Числа равны");
        }
        else
            System.out.println("Первое число " +var1+ " меньше чем второе "+var2);

    }

}
