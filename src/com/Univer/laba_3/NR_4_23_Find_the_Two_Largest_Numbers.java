package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_23_Find_the_Two_Largest_Numbers {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int largestA = arr[0];
        int largestB = -1;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array of 10 numbers");

        while (counter < 10) {
            arr[counter] = scanner.nextInt();
            for (int i = 0; i < counter; i++) {
                if (i != counter) {
                    if (arr[counter] == arr[i]) {
                        counter--;
                        System.out.println("Incorrect number. Enter correct number.");
                        break;
                    }
                }
            }
            counter++;
        }

        /*while (true) {
            flag = true;
            temp = scanner.nextInt();
            for (int i = 0; i < counter; i++) {
                if (arr[i] == temp) {
                    flag = false;
                    System.out.println("Incorrect number. Enter correct number.");
                    break;
                }
            }
            if (flag == true) {
                arr[counter] = temp;
                counter++;
            }
            if(counter==10){
                break;
            }
        }*/

        for (int y = 0; y <= 9; y++) {
            System.out.println("array numbers[" + (y + 1) + "] is: " + arr[y]);
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largestA) {
                largestB = largestA;
                largestA = arr[i];
            } else if (arr[i] > largestB && arr[i] != largestA) {
                largestB = arr[i];
            }
        }
        System.out.println("\nLargest - " + largestA);
        System.out.println("2nd largest Largest - " + largestB);

    }
}
