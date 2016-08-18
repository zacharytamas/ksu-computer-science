package CS1301.Assignment08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 8

public class MyTriangle {

  public static boolean isValid(double side1, double side2, double side3) {
    return ((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1);
  }

  public static double area(double side1, double side2, double side3) {
    double s = (side1 + side2 + side3) / 2.;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

}
