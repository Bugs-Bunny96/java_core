package com.Univer.Laba_1;

import java.util.Scanner;

public class NR_2_30 {
    public static void main(String args[]) {

        System.out.println("Введите число состоящие из 5-ти цифр");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        int dr=var;
        int st=0;

        while (dr!=0){
            dr=dr/10;
            st++;
        }

        if(st!=5){
            System.out.println("Ошибка! Вы ввели "+st+" цифр. Нужно ввести число состоящее из 5-ти цифр!");
        }else {
            String text = String.join("   ", String.valueOf(var).split(""));
            System.out.println(text);
        }


    }

}
