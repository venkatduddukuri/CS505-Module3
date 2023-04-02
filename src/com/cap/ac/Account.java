package com.cap.ac;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private double balance=200.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt){
        this.balance = this.balance+amt;
    }

    public void withdraw(double amt){
        if(this.balance>= amt){
            this.balance = this.balance-amt;
        }
    }
    public void displayMenu(){
        System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");

    }
    public String getTransactionDate(){
        Format f = new SimpleDateFormat("MM-dd-yyyy");
        String strDate = f. format(new Date());
        return strDate;
    }
}
