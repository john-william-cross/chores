package edu.dmps.computerlab.chores;
import java.util.Scanner;

public class chores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lawns did you mow?");
        int lawnsMowed = scanner.nextInt();

        System.out.println("How many dogs did you walk?");
        int dogsWalked = scanner.nextInt();

        int lawnCost = 10;
        int dogWalkCost = 5;
        int totalEarned = lawnsMowed * lawnCost + dogsWalked * dogWalkCost;

        System.out.println("You earned a total of $" + totalEarned + " from doing chores this week. Good Job!");

    }
}
