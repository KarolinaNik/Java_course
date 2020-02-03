package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]) {
        // Initialize known variables

        int rate = 15;
        int maxHours = 40;

        //Ask for unknown values
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


    }
}
