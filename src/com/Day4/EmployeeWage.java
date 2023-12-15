package com.Day4;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int hourWage = 20;
        int fullDay = 8;
        int partTime = 4;
        int month = 20;
        int totalWage = 0;
        int totalHours = 0;
        int day;
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int wageType = random.nextInt(2);

        switch (wageType) {
            case 1:
                day = fullDay;
                System.out.println("The employee is full day employee");
                break;
            default:
                day = partTime;
                System.out.println("The employee is part time employee");
        }

        for(int i=1; i<=month; i++) {
            int attendance = random.nextInt(2);
            if(totalHours > 100) {
                break;
            }
            if(attendance>0) {
                System.out.println("Day " + i + " Employee is Present");
                totalWage = totalWage + day*hourWage;
                totalHours+=day;
            }
            else {
                System.out.println("Day " + i + " Employee is Absent");
            }
        }
        System.out.println("The total wage employee earned in this month is " + totalWage);
        System.out.println("The total working hours of employee is " + totalHours);
    }
}
