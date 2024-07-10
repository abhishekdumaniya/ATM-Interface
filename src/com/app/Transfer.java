package com.app;

import java.util.Scanner;

public class Transfer {
    Scanner sc = new Scanner(System.in);
    public int transfer(){
        System.out.print("Enter your money how much do you transfer");
        int transferMoney = sc.nextInt();
        System.out.println("Your money is successfully transfer Thank you!...");
        return transferMoney;
    }
}
