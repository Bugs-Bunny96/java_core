package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_29_Square_of_Asterisks {
    public static void main(String[] args) {

        int val;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side size square.\np.s. Value from 1 to 20.");
        while(true){
            int temp;
            temp= scanner.nextInt();

            if (temp >= 1 && temp <= 20){
                val=temp;
                break;
            }else {
                System.out.println("Incorrect number! Enter value from 1 to 20.");
            }
        }

        for(int i=0; i<val; i++){
            for(int j=0; j<val; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
