package CS1301.Assignment05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 5

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String CONSONANTS = "[bcdfghjklmnpqrstvwxyz]";
        String VOWELS = "[aeiou]";

        while (true) {
            System.out.print("Enter a letter: ");
            String input = scanner.next();

            if (input.toLowerCase().matches(VOWELS)) {
                System.out.format("%c is a vowel\n", input.charAt(0));
                break;
            } else if (input.toLowerCase().matches(CONSONANTS)) {
                System.out.format("%c is a consonant\n", input.charAt(0));
                break;
            } else {
                System.out.format("%c is an invalid input\n", input.charAt(0));
            }

        }

    }

}
