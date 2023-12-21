package com.Day7.Interface;

public interface DefaultInterface {
    default void start(){
        System.out.println("Vehicle is started");
    }
    default void stop(){
        System.out.println("Vehicle is stop");
    }
}

class Bike implements DefaultInterface{
    public void start(){
        System.out.println("Bike is started");
    }
}

class DeafultInterfaceDemo{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
