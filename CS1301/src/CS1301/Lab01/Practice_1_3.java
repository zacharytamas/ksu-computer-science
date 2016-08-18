package CS1301.Lab01;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 1.3

public class Practice_1_3 {
    public static void main(String[] args) {
        int accumulator = 0;

        // Just to make things interesting, use a body-less loop.
        for (int i = 1; i <= 10; accumulator += i, i++);

        System.out.print(accumulator);
    }
}
