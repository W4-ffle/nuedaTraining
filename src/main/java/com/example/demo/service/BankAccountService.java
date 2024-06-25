package com.example.demo.service;

import com.example.demo.model.BankAccount;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {
    private List<BankAccount> accounts = new ArrayList<>();

    // Constructor to add initial dummy data
    public BankAccountService() {
        accounts.add(new BankAccount("Callum", "Citi Bank, Belfast", 500.0));
        accounts.add(new BankAccount("Barry", "HolyLands, Belfast", 1500.0));
        accounts.add(new BankAccount("Lukas", "Citi, Belfast", 2500.0));
    }

    // Method to retrieve all bank accounts
    public List<BankAccount> getAllAccounts() {
        return accounts;
    }

    // Method to retrieve a bank account by name
    public BankAccount getAccount(String name) {
        for (BankAccount account : accounts) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null; // Return null if account with given name is not found
    }
}

