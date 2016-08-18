package CS1301.Lab05;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 5

import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();

        Boolean isSubstring = s1.contains(s2);

        if (isSubstring) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
