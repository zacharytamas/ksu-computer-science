package Assignment05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 5

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double withholdingRateFederal = scanner.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double withholdingRateState = scanner.nextDouble();

        System.out.println();

        double grossPay = hoursWorked * payRate;
        double withholdingFederal = grossPay * withholdingRateFederal;
        double withholdingState = grossPay * withholdingRateState;
        double totalWithholding = withholdingFederal + withholdingState;

        System.out.println("Employee Name: " + employeeName);
        System.out.format("Hours Worked: %.1f\n", hoursWorked);
        System.out.format("Pay Rate: $%.2f\n", payRate);

        System.out.format("Gross Pay: $%.2f\n", grossPay);

        System.out.println("Deductions:");
        System.out.format ("  Federal Withholding (%.1f): $%.2f\n", withholdingRateFederal, withholdingFederal);
        System.out.format ("  State Withholding (%.1f): $%.2f\n", withholdingRateState, withholdingState);
        System.out.format ("  Total Deduction: $%.2f\n", totalWithholding);
        System.out.format ("Net Pay: $%.2f\n", grossPay - totalWithholding);
    }

}
