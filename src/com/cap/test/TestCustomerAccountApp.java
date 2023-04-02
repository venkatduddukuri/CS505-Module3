package com.cap.test;

import com.cap.ac.Account;
import com.cap.db.CustomerDB;
import com.cap.model.Customer;

import java.io.IOException;
import java.util.Scanner;

public class TestCustomerAccountApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Customer Account App");

        System.out.println("Enter a customer ID\n");
        System.out.println("  ex:1007, 1008, 1009>:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Customer customer = CustomerDB.getCustomer(id);
        Account account = new Account();
        inputs(account,customer);
    }
public static void inputs(Account account,Customer customer){
    account.displayMenu();
    System.out.println("    Enter option>:");
    Scanner scanner2 = new Scanner(System.in);
    String option = scanner2.nextLine();
    if("W".equalsIgnoreCase(option)){
        System.out.println("Enter withdraw amount:");
        double amt = scanner2.nextDouble();
        account.withdraw(amt);
        System.out.println("Continue? (Y/N):");
        Scanner scanner3 = new Scanner(System.in);
        String decision = scanner3.nextLine();
        if(decision.equalsIgnoreCase("N")){
            displayDetails(customer,account);
        }else{
            inputs(account,customer);
        }
    } else if ("D".equalsIgnoreCase(option)) {
        System.out.println("Enter deposit amount:");
        Scanner scanner7 = new Scanner(System.in);
        double amt = scanner7.nextDouble();
        account.deposit(amt);
        System.out.println("Continue? (Y/N):");
        Scanner scanner4 = new Scanner(System.in);
        String decision = scanner4.nextLine();
        if(decision.equalsIgnoreCase("N")){
            displayDetails(customer,account);
        }else{
            inputs(account,customer);
        }
    } else if ("B".equalsIgnoreCase(option)) {
        System.out.printf("Account Balance : $%,6.2f",account.getBalance());
        System.out.println("\nContinue? (Y/N):");
        Scanner scanner5 = new Scanner(System.in);
        String decision = scanner5.nextLine();
        if(decision.equalsIgnoreCase("N")){
            displayDetails(customer,account);
        }else{
            inputs(account,customer);
        }

    }else{
        System.out.println("Invalid option");
        System.out.println("Continue? (Y/N):");
        Scanner scanner6 = new Scanner(System.in);
        String decision = scanner6.nextLine();
        if(decision.equalsIgnoreCase("N")){
            displayDetails(customer,account);
        }
    }

}
    public static void displayDetails(Customer customer,Account account){
        System.out.println("--Customer Details--");
        System.out.println("Name: "+customer.getName());
        System.out.println("Address: "+customer.getAddress());
        System.out.println("City: "+customer.getCity());
        System.out.println("Zip: "+customer.getZip());
        System.out.printf("Balance as of "+account.getTransactionDate()+" is :$%,6.2f",account.getBalance());
        System.out.println("\nEnd of line..");
    }
}
