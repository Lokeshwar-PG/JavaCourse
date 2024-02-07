package com.Day13;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("horse");
        animals.add("dog");
        animals.add("cow");
        System.out.println("The Linked List is: "+animals);
        animals.add(0,"cat");
        System.out.println("The Linked List is: "+animals);
        System.out.println("Second element: "+animals.get(1));
        animals.set(0,"crocodile");
        System.out.println("The Linked List is: "+animals);
        animals.remove(0);
        System.out.println("The Linked List is: "+animals);
        animals.remove("dog");
        System.out.println("The Linked List is: "+animals);
    }
}

//https://www.programiz.com/java-programming/linkedlist
