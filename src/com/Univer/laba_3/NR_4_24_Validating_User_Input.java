package com.Univer.laba_3;

import java.net.SocketTimeoutException;
import java.util.Scanner; // class uses class Scanner

public class NR_4_24_Validating_User_Input {

    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int counter = 0;

        // process 10 students using counter-controlled loop
        while (true) {
            // prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 1) {
                passes = passes + 1;
                counter++;
            } else if (result == 2) {
                failures = failures + 1;
                counter++;
            } else {
                System.out.println("Incorrect number! Enter 1 or 2.");
            }
            if(counter>9){
                break;
            }
        }

        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
} // end class Analysis
