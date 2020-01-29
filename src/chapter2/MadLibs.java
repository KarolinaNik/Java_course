package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season of the year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adj = scanner.next();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of coffee");

    }
}
