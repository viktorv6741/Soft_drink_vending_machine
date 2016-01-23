package com;

import java.util.Scanner;

public class SoftDrinkVendingMachine {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //Input value
///////////////////////////////////////////////////////////////

        System.out.println("Enter Dollars :");
        int banknotesValue = console.nextInt();

        System.out.println("Enter Cents :");
        int coinsValue = console.nextInt();

        //Output value
///////////////////////////////////////////////////////////////

        System.out.println("You have paid : ");

        Money money1 = new Banknotes(banknotesValue);
        money1.pay();

        Money money2 = new Coins(coinsValue);
        money2.pay();

    }
}
