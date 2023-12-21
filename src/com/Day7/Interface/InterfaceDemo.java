package com.Day7.Interface;

public interface InterfaceDemo {
    void run();
}

interface InterfaceDemo1 {
    void run1();
}

class Child implements InterfaceDemo {
    @Override
    public void run() {
        System.out.println("This is child class...");
    }
}