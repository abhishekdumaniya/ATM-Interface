package com.app;

import java.util.Scanner;

public class Withdraw {

    Scanner sc = new Scanner(System.in);
    public int withdraw(){
        System.out.print("Enter your money how much do you withdraw");
        int withdrawMoney = sc.nextInt();
        System.out.println("Your money is successfully withdraw Thank you!...");
        return withdrawMoney;
    }


}
