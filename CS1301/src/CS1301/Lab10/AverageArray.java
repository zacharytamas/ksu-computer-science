package CS1301.Lab10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 10

import java.util.Scanner;

public class AverageArray {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      // Though this problem asks me to make two overloaded methods, it only asks me
      // to use the double[] form...

      System.out.print("Enter 10 double numbers: ");

      double[] numbers = new double[10];

      for (int i = 0; i < 10; i++) {
        numbers[i] = scanner.nextDouble();
      }

      System.out.printf("The average is %f", average(numbers));

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  public static int average(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; sum += array[i++]);
    return sum / array.length;
  }

  public static double average(double[] array) {
    double sum = 0;
    for (int i = 0; i < array.length; sum += array[i++]);
    return sum / array.length;
  }


}
