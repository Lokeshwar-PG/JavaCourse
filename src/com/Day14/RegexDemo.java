package com.Day14;

public class RegexDemo {
    public static void main(String[] args) {
        String firstName = "Lokesh";
        String regex = "[A-Z]{1}[a-z]{2,}";
        System.out.println("Valid First Name: "+firstName.matches(regex));
        String phoneNumber = "91 9677595842";
        String phoneRegex = "[0-9]{10}";
        String phoneRegex2 = "[6-9]{1}[0-9]{9}";
        String phoneRegex3 = "[6789]{1}[0-9]{9}";
        String phoneRegex4 = "[91]{2}[ ]{1}[6789]{1}[0-9]{9}";
        String phoneRegex5 = "\\d";
        String phoneRegex6 =  "91\\s\\d{10}";
        System.out.println(phoneNumber.matches(phoneRegex));
        System.out.println(phoneNumber.matches(phoneRegex2));
        System.out.println(phoneNumber.matches(phoneRegex3));
        System.out.println(phoneNumber.matches(phoneRegex4));
        System.out.println(phoneNumber.matches(phoneRegex5));
        System.out.println(phoneNumber.matches(phoneRegex6));
//        [a-zA-Z0-9._%]+@yahoo.com

    }
}
