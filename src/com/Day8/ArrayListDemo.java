package com.Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1,30);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = Arrays.asList(1,2,3);
        System.out.println(list);
        System.out.println(list3);
        System.out.println(list3.size());
        list.remove(1);
//        list.remove(value);
        System.out.println(list);
        for(Integer value: list) {
            System.out.println(value);
        }
        list.removeAll(list);
        System.out.println(list);
    }
}
