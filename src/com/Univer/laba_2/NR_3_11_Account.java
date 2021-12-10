package com.Univer.laba_2;
// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

import com.Univer.laba_2.Account_Test;

import java.util.Scanner;

public class NR_3_11_Account {
    public static void main(String[] args) {

        Account_Test accountTestNR3111 = new Account_Test("Jane Green", 50.00);
        Account_Test accountTestNR3112 = new Account_Test("John Blue", 7.53);

        // display initial balance of each object
        System.out.printf("%s balance: %.3f $ %n",
                accountTestNR3111.getName(), accountTestNR3111.getBalance());
        System.out.printf("%s balance: %.3f $ %n%n",
                accountTestNR3112.getName(), accountTestNR3112.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%n withdraw from account1 balance %n%n",
                depositAmount);
        accountTestNR3111.deposit(depositAmount); // add to account1’s balance

        // display balances
        System.out.printf("%s balance: %.3f $ %n",
                accountTestNR3111.getName(), accountTestNR3111.getBalance());
        System.out.printf("%s balance: %.3f $ %n%n",
                accountTestNR3112.getName(), accountTestNR3112.getBalance());

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%n withdraw from account2 balance %n%n",
                depositAmount);
        accountTestNR3112.deposit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("%s balance: %.3f  %n",
                accountTestNR3111.getName(), accountTestNR3111.getBalance());
        System.out.printf("%s balance: %.3f $ %n%n",
                accountTestNR3112.getName(), accountTestNR3112.getBalance());

    }
}