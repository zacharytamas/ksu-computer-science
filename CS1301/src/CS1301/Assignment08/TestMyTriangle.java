package CS1301.Assignment08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 8

import java.util.Scanner;

public class TestMyTriangle {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter the lengths of the triangle's sides with spaces between: ");

      double side1 = scanner.nextDouble();
      double side2 = scanner.nextDouble();
      double side3 = scanner.nextDouble();

      if (MyTriangle.isValid(side1, side2, side3)) {
        System.out.println("The area is " + MyTriangle.area(side1, side2, side3));
      } else {
        System.out.println("That's an invalid set of lengths. Let's try again.");
        continue;
      }

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

}
