package CS1301.Lab08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 8

import java.util.Scanner;

public class ComputeAreas {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter square side length: ");
      double squareSide = scanner.nextDouble();

      System.out.print("\nEnter Rectangle width: ");
      double rectWidth = scanner.nextDouble();
      System.out.print("\nEnter Rectangle height: ");
      double rectHeight = scanner.nextDouble();

      System.out.print("\nEnter Circle radius: ");
      double circleRadius = scanner.nextDouble();

      System.out.print("\nEnter Triangle base: ");
      double triangleBase = scanner.nextDouble();
      System.out.print("\nEnter Triangle height: ");
      double triangleHeight = scanner.nextDouble();



      System.out.println("\n===\n");

      System.out.println("Square Side =\t\t\t" + squareSide);
      System.out.format("Square Area =\t\t\t%.2f\n", squareArea(squareSide));
      System.out.println();

      System.out.println("Rectangle width =\t\t" + rectWidth);
      System.out.println("Rectangle height =\t\t" + rectHeight);
      System.out.format("Rectangle Area =\t\t%.2f\n", rectangleArea(rectWidth, rectHeight));
      System.out.println();

      System.out.println("Circle Radius =\t\t\t" + circleRadius);
      System.out.format("Circle Area =\t\t\t%.2f\n", circleArea(circleRadius));
      System.out.println();

      System.out.println("Triangle base=\t\t\t" + triangleBase);
      System.out.println("Triangle height =\t\t" + triangleHeight);
      System.out.format("Triangle Area =\t\t\t%.2f\n", triangleArea(triangleBase, triangleHeight));
      System.out.println();

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  private static double triangleArea(double base, double height) {
    return base * height * .5;
  }

  private static double circleArea(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

  private static double rectangleArea(double width, double length) {
    return width * length;
  }

  private static double squareArea(double side) {
    return side * side;
  }

}
