//Total Marks: 10
//Scenario: A bank wants to create a simple account management system. Account information must be private to prevent unauthorized modification. The bank also wants to count the total number of accounts created.
//        (a) Create a class BankAccount with private fields: accountHolder, accountNumber, and balance. Provide getter and setter methods. [4]
//        (b) Create a parameterized constructor to initialize all fields. [2]
//        (c) Create a static variable accountCount that increments whenever an account is created. Also create a final variable bankName initialized to "State Bank". [2]
//        (d) Complete the class using the driver code. [2]

import java.util.*;

class BankAccount {
    
    private String accountHolder;
    private int accountNumber;
    private double balance;

    
    static int accountCount = 0;


    final String bankName = "State Bank";


    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

        accountCount++;
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Aditya", 101, 50000);
        BankAccount a2 = new BankAccount("Rahul", 102, 30000);

        System.out.println("Bank Name: " + a1.bankName);

        System.out.println("Account Holder: " + a1.getAccountHolder());
        System.out.println("Account Number: " + a1.getAccountNumber());
        System.out.println("Balance: " + a1.getBalance());

        System.out.println("Account Holder: " + a2.getAccountHolder());
        System.out.println("Account Number: " + a2.getAccountNumber());
        System.out.println("Balance: " + a2.getBalance());

        System.out.println("Total Accounts: " + BankAccount.accountCount);
    }
}