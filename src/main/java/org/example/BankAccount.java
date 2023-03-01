package org.example;

import java.util.*;
import java.util.logging.*;
class BankAccount {
    public static void main(String[] args) {

        String holderName;
        int accountNumber;
        int balance;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Logger l=Logger.getLogger("BankAccount");
        l.info("Enter the Account Holder Name : ");
        holderName = sc.nextLine();
        l.info("Enter the Account Number : ");
        accountNumber = sc.nextInt();
        l.info("Enter Your Account Balance : ");
        balance = sc.nextInt();
        Details ob = new Details(holderName, accountNumber,balance);

        while (choice != 4) {
            l.info("\nService Provided ....\n 1.Deposit \n 2.Withdraw \n 3.check Balance \n 4.Exit \n");
            l.info("\nEnter Your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> ob.deposit();
                case 2 -> ob.withdraw();
                case 3 -> ob.balance();
                case 4 -> l.info("\nThanks for Visiting Our Bank.....");
                default -> l.info("\nInvalid Option .....");
            }
        }
    }
}
