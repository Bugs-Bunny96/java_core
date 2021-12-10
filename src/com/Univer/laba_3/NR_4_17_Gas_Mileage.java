package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_17_Gas_Mileage {
    public static void main(String[] args) {

        int gallon;
        int miles;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Trip 1");
        System.out.println("Enter the number of miles traveled: ");
        miles = scanner.nextInt();
        System.out.println("Enter the number of gallon spent: ");
        gallon = scanner.nextInt();
        double temp1;
        temp1 = (double) miles / gallon;

        System.out.println("Trip 2");
        System.out.println("Enter the number of miles traveled: ");
        miles = scanner.nextInt();
        System.out.println("Enter the number of gallon spent: ");
        gallon = scanner.nextInt();
        double temp2;
        temp2=(double) miles/gallon;

        System.out.println("Trip 3");
        System.out.println("Enter the number of miles traveled: ");
        miles = scanner.nextInt();
        System.out.println("Enter the number of gallon spent: ");
        gallon = scanner.nextInt();
        double temp3;
        temp3=(double) miles/gallon;

        double obTemp;
        obTemp = (temp1+temp2+temp3)/3 ;

        System.out.println("Trip 1 mili/galon = " + temp1);
        System.out.println("Trip 2 mili/galon = " + temp2);
        System.out.println("Trip 3 mili/galon = " + temp3);
        System.out.println("Average for all trips mili/galon = " + obTemp);


    }
}
