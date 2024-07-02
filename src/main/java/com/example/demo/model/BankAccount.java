package com.example.demo.model;

public class BankAccount {
    private String name;
    private String address;
    private double balance;

    public BankAccount(String name, String address) {
        this.name = name;
        this.address = address;
        this.balance = 0.0; // Default initial balance
    }

    public BankAccount(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer Name:" + "\n"
                + "Address: " + "\n"
                + "Balance: ";
    }
}
