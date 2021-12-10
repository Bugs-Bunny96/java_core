package com.Univer.laba_3;

import java.net.SocketTimeoutException;
import java.util.Formatter;
import java.util.Scanner;

public class NR_4_22_Tabular_Output {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое значение: ");
            int var1 = scanner.nextInt();
            System.out.println("Введите второе значение: ");
            int var2 = scanner.nextInt();
            System.out.println("Введите третъе значение: ");
            int var3 = scanner.nextInt();
            System.out.println("Введите третъе значение: ");
            int var4 = scanner.nextInt();
            System.out.println("Введите третъе значение: ");
            int var5 = scanner.nextInt();

        Formatter formatter = new Formatter();
        System.out.println(formatter.format("%20s %20s %20s %20s", "N", "10*N", "100*N", "1000*N"));
        formatter = new Formatter();

            System.out.println(formatter.format("%20s %20s %20s %20s", var1,var1*10, var1*100, var1*1000));
            System.out.println(formatter.format("%20s %20s %20s %20s", var2,var2*10, var2*100, var2*1000));
            System.out.println(formatter.format("%20s %20s %20s %20s", var3,var3*10, var3*100, var3*1000));
            System.out.println(formatter.format("%20s %20s %20s %20s", var4,var4*10, var4*100, var4*1000));
            System.out.println(formatter.format("%20s %20s %20s %20s", var5,var5*10, var5*100, var5*1000));
        }
    }
