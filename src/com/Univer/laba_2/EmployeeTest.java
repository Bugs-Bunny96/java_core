package com.Univer.laba_2;

public class EmployeeTest {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public EmployeeTest(){

    }

    public EmployeeTest(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary < 0)
            this.monthlySalary = 0;
        else
            this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary < 0)
            this.monthlySalary = 0;
        else
            this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getYearlySalary(){
        return monthlySalary *12;
    }
    public Object getTenPercentIncrease(){
        monthlySalary= monthlySalary*1.1;
        return monthlySalary*12;
    }

}
