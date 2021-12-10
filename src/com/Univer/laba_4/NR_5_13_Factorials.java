package com.Univer.laba_4;

public class NR_5_13_Factorials {

    static long calcRes(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcRes(20));
    }
    // Какая трудность может помешать вам вычислить факториал 100?
    // Выйдет за пределы диапозона типа данных long, что и помешает расчитать факториал 100.

}
