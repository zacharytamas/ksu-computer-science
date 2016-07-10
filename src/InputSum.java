
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 6

import java.util.ArrayList;

import java.util.Scanner;

import static java.lang.System.in;

public class InputSum {

    static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {

        while (true) {

            ArrayList<Integer> list = gatherNumbers();
            displaySetResults(list);

            System.out.print("Do you want to go again? (Y/n) ");

            if (scanner.next().toLowerCase().charAt(0) == 'n') {
                break;
            }

        }

    }

    public static void displaySetResults(ArrayList<Integer> list) {
        System.out.print("Entered Number:\t");
        int sum = 0;

        for (Integer value : list) {
            sum += value;
            System.out.format("%d ", value);
        }

        System.out.println("\nThe sum:\t\t" + sum);
    }

    public static ArrayList<Integer> gatherNumbers() {

        ArrayList<Integer> list = new ArrayList<>();
        Integer lastNumber;

        System.out.println("Enter positive Integers and press enter until the cows come home. When you're done, enter a -1 to stop.");

        while (true) {
            lastNumber = scanner.nextInt();

            if (lastNumber < -1) {
                System.out.println("I said positive Integers. Ignoring that one.");
                continue;
            }

            if (lastNumber == -1) break;

            list.add(lastNumber);

        }

        return list;

    }

}
