package CS1301.Assignment01;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 1

public class Table {
    public static void main(String[] args) {

        System.out.println("a   a^2   a^3");

        for (int a = 1; a < 5; a++) {
            System.out.format("%d %5d %5d\n", a, (int) Math.pow(a, 2), (int) Math.pow(a, 3));
        }

    }
}
