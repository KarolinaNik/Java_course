package chapter3;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "Work harder!";
                break;
            case "F":
                message = "Oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);

    }
}
