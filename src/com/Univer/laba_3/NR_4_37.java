package com.Univer.laba_3;

import java.util.Scanner;

public class NR_4_37 {

        static int calcRes ( int n){
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    public static void main(String[] args) {
            System.out.println(calcRes(5));
        }
    }
