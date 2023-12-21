package com.Day9;

public class GenericsDemo {

    public static void printIntArray(Integer[] elem){
        for(Integer val : elem){
            System.out.println(val);
        }
        System.out.println();
    }
    public static void printCharArray(Character[] elemchar){
        for(Character cval : elemchar){
            System.out.println(cval);
        }
        System.out.println();
    }

    public static <E> void printGenericArray(E[] array) {
        for(E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Character[] charArray = {'L','O','K','E','S','H'};
        printGenericArray(intArray);
        printGenericArray(charArray);
    }
}
