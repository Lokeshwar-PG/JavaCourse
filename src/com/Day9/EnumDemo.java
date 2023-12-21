package com.Day9;

public class EnumDemo {
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY }
    public static void main(String[] args) {
        Day d = Day.FRIDAY;
        if(d==Day.FRIDAY || d== Day.SUNDAY){
            System.out.println("the day is weekend!...");
        }else{
            System.out.println("the day is not weekend!...");
        }

    }
}
