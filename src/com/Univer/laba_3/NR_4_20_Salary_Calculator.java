package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_20_Salary_Calculator {
    public static void main(String[] args) {

        int salary;
        double temp;
        int workHours;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите зп за один отработаный час: ");
        salary = scanner.nextInt();
        System.out.println("Введите количество проработаных часов: ");

        while (true) {
            workHours = scanner.nextInt();
            if (workHours>0) {
                break;
            }else {
                System.out.println("Incorrect number");
            }
        }

        if (workHours<=40){
            temp=salary*(double)workHours;
            System.out.println("menee 40 4as ZP = " + temp);
        }else{
            double temp2;
            temp2=workHours-40;
            temp = 40*salary+(temp2*salary*1.5);
            System.out.println("bolee 40 4as zp = "+temp);
        }
    }
}
