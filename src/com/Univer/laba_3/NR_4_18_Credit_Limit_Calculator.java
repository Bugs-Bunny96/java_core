package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_18_Credit_Limit_Calculator {
    public static void main(String[] args) {

        int accountNumber;
        double beginningBalance;
        double charges;
        double credits;
        double creditLimit;
        double newBalance;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your account number. ");
        accountNumber = scanner.nextInt();
        System.out.println("Enter your balance at the beginning of the month.");
        beginningBalance = scanner.nextDouble();
        System.out.println("Enter the total of all items exhibited this month.");
        charges= scanner.nextDouble();
        System.out.println("Enter the amount of all credits credited to the account this month.");
        credits = scanner.nextDouble();
        System.out.println("Enter your credit limit.");
        creditLimit= scanner.nextDouble();

        newBalance=beginningBalance+charges-credits;
        System.out.println("Account number: "+accountNumber+ "\nYour new balance is: "+newBalance);
        if(newBalance>creditLimit){
            System.out.println("Credit limit exceeded!");
        }
    }
}
