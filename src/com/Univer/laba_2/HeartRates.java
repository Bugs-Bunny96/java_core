package com.Univer.laba_2;

import java.util.Random;

public class HeartRates {

    private String lastName;
    private String firstName;
    private int month;
    private int day;
    private int year;

    public HeartRates() {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMonth(int month) {
        if (month < 1) {
            System.out.println("Error! Month can't be less than 1");
        } else if (month > 12) {
            System.out.println("Error! Month can't be more than 12");
        } else
            this.month = month;
    }

    public void setDay(int day) {
        if (day < 1) {
            System.out.println("Error! Day can't be less than 1");
        } else if (day > 31) {
            System.out.println("Error! Day can't be less than 31");
        } else
            this.day = day;
    }

    public void setYear(int year) {
        if (year < 1901) {
            System.out.println("Error! Year can't be less than 1901");
        } else if (year > 2021) {
            System.out.println("Error! Year can't be less than 2021");
        } else
            this.year = year;
    }

    public void DisplayDate() {
        this.year = 2021 - year;
        System.out.println(" " + this.year);
    }

    public void MaximumHeartRate(){
        int mhr = 220 - year;
        System.out.println("Максимальная частота пульса ударов в минуту: "+ mhr);
    }

    public void TargetHeartRate(){
        double rnd = 0.5 + Math.random()*0.35;
        int thr = (220-year);
        double thr1 = rnd*thr;
        int thr2 =(int)thr1;
/*        System.out.println("rnd "+rnd);
        System.out.println("thr1 "+thr1);*/
        System.out.println("Целевая частота пульса: "+thr2);
    }


}
