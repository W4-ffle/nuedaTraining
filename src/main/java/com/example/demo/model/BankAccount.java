package com.example.demo.model;

public class BankAccount {
    private String name;
    private String address;
    private double currentBalance;

    public BankAccount(String name, String address) {
        this.name = name;
        this.address = address;
        this.currentBalance = 0.0; // Default initial balance
    }

    public BankAccount(String name, String address, double currentBalance) {
        this.name = name;
        this.address = address;
        this.currentBalance = currentBalance;
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

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Customer Name:" + "\n"
                + "Address: " + "\n"
                + "Balance: ";
    }
}
