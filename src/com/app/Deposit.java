package com.app;

import java.util.Scanner;

public class Deposit {

    Scanner sc = new Scanner(System.in);
    public int deposit(){
        System.out.print("Enter your money how much do you deposit");
        int depositMoney = sc.nextInt();
        System.out.println("Your money is successfully deposit Thank you!...");
        return depositMoney;
    }

}
