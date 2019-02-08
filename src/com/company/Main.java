package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int lawnCost = 10;
        int walkCost = 5;

        System.out.println("How many lawns did you mow?");
        Scanner scanner = new Scanner(System.in);
        int lawnsMowed = scanner.nextInt();
        System.out.println("How many dogs did you walk?");
        int dogsWalked = scanner.nextInt();

        int dogMoney = dogsWalked * walkCost;
        int lawnMoney = lawnsMowed * lawnCost;
        int totalMoney = dogMoney + lawnMoney;

        System.out.println("You made $" + totalMoney + " from walking dogs and mowing lawns.");

    }
}
