package com.Day7.Abstraction;

import com.Day7.Abstraction.AbstractionDemo;
import com.Day7.Abstraction.Child;

public class AbstractMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.demo();
        AbstractionDemo ac = new Child();
        ac.demo();
    }
}
