package Lab01;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 1.5

public class Practice_1_5 {

    /**
     * Assume that a car travels 75 miles in 50 minutes. Write a java program
     * (name it Lab01.Practice_1_5) to display the average speed in kilometers per hour.
     * Note that 1 mile equals to 1.6 kilometer.
     */
    public static void main(String[] args) {
        double KMS_PER_MILE = 1.6;

        int distance = 75;
        int time = 50;

        double milesPerMinute = (double) distance / time;
        double kilometersPerMinute = milesPerMinute * KMS_PER_MILE;
        double kilometersPerHour = kilometersPerMinute * 60;

        System.out.format("%.1f km/h. Slow down!", kilometersPerHour);
    }

}
