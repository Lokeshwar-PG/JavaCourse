package com.Day6;

public class EncapsulationStudent {

    private int studentId;
    private String name;
    private String address;
    private String phoneNumber;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EncapsulationStudent(int studentId, String name, String address, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        EncapsulationStudent e = new EncapsulationStudent(1,"Lokeshwar", "India", "9677595842");
        System.out.println(e.studentId+" "+e.name+" "+e.address+" "+e.phoneNumber);
        System.out.println(e.getStudentId()+" "+e.getName()+" "+e.getAddress()+" "+e.getPhoneNumber());
        e.setStudentId(2);
        e.setName("Lokesh");
        e.setAddress("US");
        e.setPhoneNumber("123456");
        System.out.println(e.studentId+" "+e.name+" "+e.address+" "+e.phoneNumber);
        System.out.println(e.getStudentId()+" "+e.getName()+" "+e.getAddress()+" "+e.getPhoneNumber());

    }
}
