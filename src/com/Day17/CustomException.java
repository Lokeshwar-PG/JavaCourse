package com.Day17;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String firstName = sc.next();
        try {
            if(!firstName.matches("[A-Z][a-z]{2,}")) {
                throw new IllegalAccessException();
            }
        } catch (IllegalAccessException e) {
            System.out.println("Not matched");
        }
    }
}
