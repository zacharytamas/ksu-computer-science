package CS1301.Lab06;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 6

import java.util.Scanner;

public class Practice_6_4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String entry = scanner.nextLine();

    System.out.println("Entered String: " + entry);

    for (int i = 1; i <= entry.length(); i++) {
      System.out.format("Character #%d:\t %s\n", i, entry.charAt(i - 1));
    }

  }

}
