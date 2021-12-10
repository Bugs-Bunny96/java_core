package com.Univer.laba_2;

import java.util.Scanner;


public class NR_3_17_HealthProfile {
    public static void main(String[] args) {
        int gender = 0;

        HealthProfile healthProfile = new HealthProfile();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Имя ");
        healthProfile.setLastName(scanner.next());
        System.out.println("Введите Фамилию ");
        healthProfile.setFirstName(scanner.next());
        System.out.println("Дата рождения.");
        System.out.println("Введите мясяц ");
        healthProfile.setMonth(scanner.nextInt());
        System.out.println("Введите число ");
        healthProfile.setDay(scanner.nextInt());
        System.out.println("Введите год ");
        healthProfile.setYear(scanner.nextInt());

        System.out.println("Введите ваш рост в см: ");
        healthProfile.setHeight(scanner.nextInt());

        System.out.println("Введите ваш вес в кг: ");
        healthProfile.setWeight(scanner.nextInt());

        System.out.println("Введите число '1' если ваш пол 'Мужской', если ваш пол 'Женский' введите число '2'.");
        while(true){
            int temp;
            temp = scanner.nextInt();

            if (temp == 1 || temp == 2){
                healthProfile.setGender(temp);
                break;
            }else {
                System.out.println("Incorrect number");
            }
        }



        System.out.printf("Имя: %s%nФамилия: %s%nВозраст: ", healthProfile.getLastName()
                , healthProfile.getFirstName());

        healthProfile.DisplayDate(); // вывод возвросто в годах

        System.out.printf("Рост: %s%nВес: %s%nПол: %s%n \n",healthProfile.getHeight()
                ,healthProfile.getWeight(), healthProfile.getGender());

/*        healthProfile.getGender(); // вывод пол

        healthProfile.getHeight(); // вывод рост

        healthProfile.getWeight(); // вывод вес*/



        healthProfile.MaximumHeartRate(); // вывод Максимальной частоты пульса

        healthProfile.TargetHeartRate(); // вывод целевой частоты пульса

        healthProfile.BMI(); // вывод ИМТ

        System.out.println("\nBMI VALUES\n" +
                "Underweight: less than 18.5\n" +
                "Normal:      between 18.5 and 24.9\n" +
                "Overweight:  between 25 and 29.9\n" +
                "Obese:       30 or greater");

    }
}
