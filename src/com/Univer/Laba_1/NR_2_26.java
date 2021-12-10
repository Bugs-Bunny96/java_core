package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_26 {
    public static void main(String args[]) {

        System.out.println("Введите 1-е число");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();

        System.out.println("Введите 2-е число");
        int var2 = scanner.nextInt();

        if((var2%var1)==0){
            System.out.println("Число "+var1+" кратно числу "+var2);
        }else
            System.out.println("Число "+var1+" не кратно числу "+var2);

    }
}
