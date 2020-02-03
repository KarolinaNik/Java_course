package chapter3;

/*
 * Logical Operators:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]) {
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter salary:");
        Scanner scanner = new Scanner(System.in);
        double Salary = scanner.nextInt();

        System.out.println("Enter years:");
        double Years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (Salary >= requiredSalary && Years >= requiredYearsEmployed) {
            System.out.println("Congrats!");
        } else {
            System.out.println("Sorry. You need " + requiredSalary + " salary");
        }
    }
}
