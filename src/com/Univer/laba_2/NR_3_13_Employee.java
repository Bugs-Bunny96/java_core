package com.Univer.laba_2;

import java.util.Scanner;

public class NR_3_13_Employee {
    public static void main(String[] args) {

        EmployeeTest employee = new EmployeeTest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter last name:");
        employee.setFirstName(scanner.next());
        System.out.println("Enter first name:");
        employee.setLastName(scanner.next());
        System.out.println("Enter monthly salary:");
        employee.setMonthlySalary(scanner.nextDouble());

        System.out.printf(" First name: %s%n Last name %s%n MonthlySalary: %s%n Yearly salary: %s%n",
                employee.getFirstName(), employee.getLastName(), employee.getMonthlySalary(), employee.getYearlySalary());
        System.out.printf(" Yearly salary increased by ten percent: %s%n", employee.getTenPercentIncrease());
    }
}
