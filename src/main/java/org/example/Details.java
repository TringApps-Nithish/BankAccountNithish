package org.example;

import java.util.*;
import java.util.logging.*;

        /*
         * 1. Design a class for a simple bank account. The class should have the  following features:
         * - Instance variables for the account holder's name, account number, and  balance.
         * - A constructor that allows the user to create an account with a given name, account number, and balance.
         * - A method that allows the user to make a deposit to the account.
         * - A method that allows the user to make a withdrawal from the account.
         * - A method that returns the current balance of the account.
         */

        class Details {
            Scanner sc = new Scanner(System.in);
            Logger l=Logger.getLogger("BankAccount");
            String holderName;
            int accountNumber;
            int bal;
            int depositAmount;
            int withdrawAmount;

            Details(String name, int an,int bal) {
                this.holderName = name;
                this.accountNumber = an;
                this.bal = bal;
            }

            void deposit() {
                l.info("\nEnter Amount You Want To Deposit : ");
                depositAmount = sc.nextInt();
                bal += depositAmount;
            }

            void withdraw() {
                l.info("\nEnter Amount You Want To WithDraw : ");
                withdrawAmount = sc.nextInt();
                bal -= withdrawAmount;
            }

            void balance() {
                String s="\nYour Current Balance : " + bal;
                l.info(s);
            }

        }



