package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_36_Sides_of_a_Right_Triangle {
    public static void main(String[] args) {

        int cat1;
        int cat2;
        int gip;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение стороны треугольника, 1-го катета:");
        cat1 = scanner.nextInt();
        System.out.println("Введите значение стороны треугольника, 2-го катета:");
        cat2 = scanner.nextInt();
        System.out.println("Введите значение стороны треугольника, гипотенузы:");
        gip = scanner.nextInt();

        int temp1;
        temp1=(cat1*cat1)+(cat2*cat2);
        int temp2=gip*gip;
        if(temp2 == temp1){
            System.out.println("Данные значения могут представлять стороны прямоугольного треугольника.");
        }else
            System.out.println("Данные значения не могут представлять стороны прямоугольного треугольника.");
    }
}
