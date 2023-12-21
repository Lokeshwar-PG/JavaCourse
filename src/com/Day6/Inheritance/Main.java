package com.Day6.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.startVehicle();
        c.cleaning();
        c.stopVehicle();

        Electric e = new Electric();
        e.startVehicle();
        e.cleaning();
        e.running();
    }
}
