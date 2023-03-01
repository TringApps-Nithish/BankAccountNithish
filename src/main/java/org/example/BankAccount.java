package org.example;

import java.util.*;
import java.util.logging.*;
class BankAccount {
    public static void main(String[] args) {

        String holderName;
        int accountNumber;
        int balance;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        Logger l=Logger.getLogger("BankAccount");
        l.info("Enter the Account Holder Name : ");
        holderName = sc.nextLine();
        l.info("Enter the Account Number : ");
        accountNumber = sc.nextInt();
        l.info("Enter Your Account Balance : ");
        balance = sc.nextInt();
        Details ob = new Details(holderName, accountNumber,balance);

        while (ch != 4) {
            l.info("\nService Provided ....\n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit \n");
            l.info("\nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> ob.deposit();
                case 2 -> ob.withdraw();
                case 3 -> ob.balance();
                case 4 -> l.info("\nThanks for Visiting Our Bank.....");
                default -> l.info("\nInvalid Option .....");
            }
        }
    }
}
