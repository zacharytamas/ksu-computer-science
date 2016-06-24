
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 3

import java.util.concurrent.ThreadLocalRandom;

/**
 *  Write a Java program (name it Practice_3_2) that generates a
 *  random number between 0 and 100 (representing a grade). The program
 *  then, on separate lines, prints out the generated grade followed by the
 *  corresponding letter grade (A, B, C, D, F) using the standard scale
 *  below. Label your output properly and use escape characters to lineup
 *  the outputs after the labels.
 */
public class Practice_3_2 {

    public static void main(String[] args) {
        int randomGrade = ThreadLocalRandom.current().nextInt(0, 101);

        System.out.format("Number Grade: %d\n", randomGrade);
        System.out.format("Letter Grade: %c\n", toLetterGrade(randomGrade));
    }

    public static char toLetterGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
