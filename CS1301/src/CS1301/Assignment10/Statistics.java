package CS1301.Assignment10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 10

import java.util.Scanner;

public class Statistics {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      double[] numbers = new double[10];
      System.out.print("Enter ten numbers: ");

      for (int i = 0; i < 10; i++) {
        numbers[i] = scanner.nextDouble();
      }

      double mean = mean(numbers);
      System.out.printf("The mean is %.2f\n", mean);
      System.out.printf("The standard deviation is %f\n", deviation(numbers));

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  public static double deviation(double[] x) {
    double sum = 0;
    double mean = mean(x);

    for (int i = 0; i < x.length; i++) {
      sum += Math.pow(x[i] - mean, 2);
    }

    return Math.sqrt(sum / (x.length - 1));
  }

  public static double mean(double[] x) {
    double sum = 0;
    for (int i = 0; i < x.length; sum += x[i++]);
    return sum / x.length;
  }

}
