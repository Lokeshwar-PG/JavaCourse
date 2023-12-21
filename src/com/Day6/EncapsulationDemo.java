package com.Day6;

public class EncapsulationDemo {
    int empId;
    String empName;

    public EncapsulationDemo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public static void main(String[] args) {


    }
}
