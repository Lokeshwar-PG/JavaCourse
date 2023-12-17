package com.Day6;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int value) {
        this.balance+=value;
        System.out.println(this.getBalance());
    }

    public void withdraw(int value) {
        this.balance-=value;
        System.out.println(this.getBalance());
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500);
        System.out.println(acc.getBalance());
        acc.deposit(1000);
        acc.withdraw(500);
    }
}
