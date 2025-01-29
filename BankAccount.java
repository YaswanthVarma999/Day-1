package com.wt;

public class BankAccount {
    private String accountHolderName;
    private int balance;

   
    public BankAccount(String accountHolderName, int initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Doe", 1000);

        account.checkBalance();
        account.deposit(500);
        account.checkBalance();
        account.withdraw(300);
        account.checkBalance();
        account.withdraw(1500); 
    }
}

