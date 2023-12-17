package com.Day6.Inheritance;

public class Vehicle {
    int vehicleId;
    String vehicleCompany;
    double vehiclePrice = 3000000;
    public void startVehicle() {
        System.out.println("dib dib dib dib");
    }
    public void stopVehicle() {
        System.out.println("busssssssshhhhh");
    }
}

class Car extends Vehicle {
    String carName;
    double vehiclePrice = 1000000;
    public void cleaning() {
        System.out.println("Cleaning....");
        System.out.println(super.vehiclePrice);
    }
}

class Electric extends Car {
    int batteryCapacity;
    double vehiclePrice = 500000;
    public void running() {
        System.out.println("Running");
        System.out.println(super.vehiclePrice);
    }
}
