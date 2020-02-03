package chapter3;

import java.util.Scanner;

public class DollarGame {
   /* You'll ask them how many pennies would you like?
    How many nickels would you like?
    How many dimes?
    And then, how many quarters? */

    public static void main(String args[]) {

        System.out.println("Welcome to Pound game. Let's count your coins.");
        System.out.println("How many pennies you have?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many 10s you have?");
        int tens = scanner.nextInt();

        System.out.println("How many 20s you have?");
        int twenties = scanner.nextInt();

        System.out.println("How many 50s you have?");
        int fifties = scanner.nextInt();

        scanner.close();

        int dollar = pennies + tens * 10 + twenties * 20 + fifties * 50;
        if (dollar == 100) {
            System.out.println("You've got a dollar!");
        } else if (dollar < 100) {
            System.out.println("You need " + (100 - dollar));
        } else {
            System.out.println("You have extra " + (dollar - 100) + " pennies");
        }
    }
}
