package com.Day7.Abstraction;

//class - class ->extends
//class ->interface ->implenment
//interface to interface ->extends

abstract public class AbstractionDemo {
    abstract void demo();
}

class Child extends AbstractionDemo {
    void demo(){
        System.out.println("This is demo method...");
    }
}
