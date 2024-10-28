package se.lexicon;

import java.util.UUID;

public class BankAccount {
    //Fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //Constructor
    public BankAccount(double balance, String customerName, String email, String phoneNumber) {
        this.generateAccountNumber();
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    //Methods
    private void generateAccountNumber() {
        this.accountNumber = UUID.randomUUID().toString();
    }
    //Getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //methods

    public void deposit (double amount){
        //adds Amount to balance
        balance += amount;
    }
    public void withdraw (double amount){
        if (balance >= amount){
            //decreases the balance with the amount
            balance -=amount;
    } else {

            System.out.println("Insufficient Balance!");
        }
    }
}







