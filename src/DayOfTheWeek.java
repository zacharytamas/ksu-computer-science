// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 4

import java.util.Scanner;

public class DayOfTheWeek {

    private static String[] DAYS = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int date = scanner.nextInt();

        System.out.println("Day of the week is " + dayOfTheWeek(month, date, year));
    }

    public static String dayOfTheWeek(int m, int q, int year) {

        // "m is the month (3: March, 4: April, ..., 12: December). January and February
        // are counted as months 13 and 14 of the previous year."
        // Here if the provided value is less than 3, we adjust them.
        if (m < 3) {
            m += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;

        int sum = q;
        sum += (26 * (m + 1)) / 10;
        sum += k;
        sum += k / 4;
        sum += j / 4;
        sum += 5 * j;

        return DAYS[sum % 7];
    }

}
