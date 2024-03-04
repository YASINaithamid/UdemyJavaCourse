package org.example.model;

import java.util.UUID;

public class BankAccount {
     private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;


    public  BankAccount(){
        this.accountId= UUID.randomUUID().toString();
        this.status=AccountStatus.CREATED;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId" +accountId+
                "balance" +balance+
                "currency" +currency+
                 '}';
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
