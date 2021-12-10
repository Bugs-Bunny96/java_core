package com.Univer.laba_2;

public class DateTest {

    private int month;
    private int day;
    private int year;

    public DateTest() {

    }

    public DateTest(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1) {
            System.out.println("Error! Month can't be less than 1.");
        } else if (month > 12) {
            System.out.println("Error! Month can't be more than 12.");
        } else
            this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if (day < 1) {
            System.out.println("Error! Day can't be less than 1.");
        } else if (day > 31) {
            System.out.println("Error! Day can't be more than 31.");
        } else
            this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1) {
            System.out.println("Error! Year can't be less than 1.");
        } else if (year > 2100) {
            System.out.println("Error! Year can't be more than 2100.");
        } else
            this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void DisplayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
