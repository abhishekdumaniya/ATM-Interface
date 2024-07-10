package com.app;

import com.app.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to ATM!.....");

        Map<Integer, Integer> accountDetails = new HashMap<>();
        accountDetails.put(10001,1899);
        accountDetails.put(10002,1234);
        accountDetails.put(10003,1899);
        accountDetails.put(10004,1618);
        accountDetails.put(10005,7894);

        int balanced = 1_20_000;
        Choice choice = new Choice();
        Withdraw withdraw = new Withdraw();
        Deposit deposit = new Deposit();
        Transfer transfer = new Transfer();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number : ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter you account Pin : ");
        int accountPin = scanner.nextInt();

        if (accountDetails.containsKey(accountNumber)){
            int storePin = accountDetails.get(accountNumber);
            if (storePin == accountPin){
                System.out.println("Congrats! you are Login successful");
                choice.choice();
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter your choice : ");
                    int userChoice = scanner.nextInt();
                    switch (userChoice){
                        case 1:
                            System.out.println("Your bank balanced is : " + balanced);
                            break;
                        case 2:
                            int ref = withdraw.withdraw();
                            balanced -= ref;
                            System.out.println("Your balanced after withdraw : " + balanced);
                            break;
                        case 3:
                            int ref2 = deposit.deposit();
                            balanced += ref2;
                            System.out.println("Your balanced after deposit : " + balanced);
                            break;
                        case 4:
                            int ref3 = transfer.transfer();
                            balanced -= ref3;
                            System.out.println("Your money transfer is successfully : " + balanced);
                            break;
                        case 5:
                            i = 10;
                            System.out.println("Thank you for visiting");
                            break;

                        default:
                            System.out.println("Your choice is not matching check your choice");
                            break;
                    }
                }
            } else {
                System.out.println("Ohh no your pin is an incorrect try again");
            }
        } else {
            System.out.println("User not found");
        }
    }
}