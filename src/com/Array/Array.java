package com.Array;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arr = {1,2,3,4,5};
        String[] str = {"aaa","bbb"};
        array[0] = 1;
        array[1] = 2;

        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]);
        }

        for(int value: arr) {
            System.out.println(value);
        }
    }
}

