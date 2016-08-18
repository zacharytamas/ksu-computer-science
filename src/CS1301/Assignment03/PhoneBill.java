package CS1301.Assignment03;// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 2

import java.util.Scanner;

public class PhoneBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("What kind of service? (R or P) ");
        char serviceType = scanner.next().toUpperCase().charAt(0);  // Kind of a hack but not what is being taught here.

        int minutesUsed;
        Number totalCost;

        if (serviceType == 'R') {
            System.out.print("How many minutes did you use? ");
            minutesUsed = scanner.nextInt();
            totalCost = calculateRegular(minutesUsed);
        } else if (serviceType == 'P') {
            System.out.print("How many minutes were daytime? ");
            int minutesUsedDay = scanner.nextInt();

            System.out.print("How many minutes were nighttime? ");
            int minutesUsedNight = scanner.nextInt();

            totalCost = calculatePremium(minutesUsedDay, minutesUsedNight);

            minutesUsed = minutesUsedDay + minutesUsedNight;
        } else {
            System.err.println("Unknown service type.");
            System.exit(1);
            return;  // explicit return so that IntelliJ's linter doesn't complain about ambiguous initialization.
        }

        System.out.println();

        System.out.format("Account Number:\t%d\n", accountNumber);
        System.out.format("Service Type:\t%c\n", serviceType);
        System.out.format("Minutes Used:\t%d\n", minutesUsed);
        System.out.format("Total Cost:\t$%.2f\n", totalCost);

    }

    public static double calculateRegular(int minutesUsed) {

        // Regular service:
        // $10.00 plus first 50 minutes are free. Charges for over 50 minutes are $0.20 per minute.

        double BASE_COST = 10;
        int INCLUDED_MINUTES = 50;
        double OVERAGE_COST = 0.20;

        int overageMinutes = minutesUsed - INCLUDED_MINUTES;

        return BASE_COST + (OVERAGE_COST * overageMinutes);
    }

    public static Number calculatePremium(int minutesUsedDay, int minutesUsedNight) {

        // Premium service:
        // $25.00 plus:
        //     a. For calls made from 6:00AM to 6:00PM, the first 75 minutes are free;
        //        charges for over 75 minutes are $0.10 per minute.
        //     b. For calls made from 6:00PM to 6:00AM, the first 100 minutes are free;
        //        charges for over 100 minutes are $0.05 per minute.

        // NOTE: All these constants should probably not be local.
        double BASE_COST = 25;
        int INCLUDED_DAYTIME_MINUTES = 75;
        int INCLUDED_NIGHTTIME_MINUTES = 100;
        double DAYTIME_OVERAGE_COST = 0.10;
        double NIGHTTIME_OVERAGE_COST = 0.05;

        double daytimeCost = (minutesUsedDay - INCLUDED_DAYTIME_MINUTES) * DAYTIME_OVERAGE_COST;
        double nighttimeCost = (minutesUsedNight - INCLUDED_NIGHTTIME_MINUTES) * NIGHTTIME_OVERAGE_COST;

        return BASE_COST + daytimeCost + nighttimeCost;
    }

}
