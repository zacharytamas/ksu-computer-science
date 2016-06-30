
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 5

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {

    public static void main(String[] args) {

        ThreadLocalRandom generator = ThreadLocalRandom.current();

        System.out.println("a) A random integer number between 30 and 50 (inclusive). " + generator.nextInt(30, 50));
        System.out.println("b) A random integer number between 20 and -20 (inclusive). " + generator.nextInt(-20, 20));
        System.out.println("c) A random integer number between -20 and -60 (inclusive). " + generator.nextInt(-60, -20));
        System.out.println("d) A random floating-point number between 0.0 and 15.9999 (inclusive). "
            + generator.nextDouble(16.0));

    }

}
