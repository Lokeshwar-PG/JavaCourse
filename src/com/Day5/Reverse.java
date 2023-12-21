package com.Day5;

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string");
        String str = sc.nextLine();
        reverseNumber(num);
        reverseString(str);
    }
    public static void reverseNumber(int num) {
        int revnum = 0;
        while(num>0) {
            int unit = num%10;
            num = num/10;
            revnum = revnum*10+unit;
        }
        System.out.println(revnum);
    }
    public static void reverseString(String str) {
        String strrev = "";
        for(int i=str.length()-1; i>=0; i--) {
            strrev = strrev+str.charAt(i);
        }
        System.out.println(strrev);
    }
}

