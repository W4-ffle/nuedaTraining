package com.example.demo.controller;

import com.example.demo.model.BankAccount;
import com.example.demo.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    // Endpoint to get all bank accounts
    @GetMapping
    public List<BankAccount> getAllAccounts() {
        return bankAccountService.getAllAccounts();
    }

    // Endpoint to get a bank account by name
    @GetMapping("/{name}")
    public BankAccount getAccount(@PathVariable String name) {
        return bankAccountService.getAccount(name);
    }
}

