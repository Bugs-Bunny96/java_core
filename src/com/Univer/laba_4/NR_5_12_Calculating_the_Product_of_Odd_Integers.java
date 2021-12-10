package com.Univer.laba_4;

import java.util.Scanner;
import java.util.Locale;
public class NR_5_12_Calculating_the_Product_of_Odd_Integers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int ne4et = 1;
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter]%2 != 0) {
                ne4et *= arr[counter];
            }
        }
        System.out.println(" Product Number = " + ne4et);
    }
}
