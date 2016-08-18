package CS1301.Lab08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 8

import java.util.Scanner;

public class MinMaxAvg {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter three integers, separated by spaces: ");

      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int z = scanner.nextInt();

      System.out.format("\nYou entered: \t%d\t%d\t%d\n", x, y, z);
      System.out.format("Max value: \t\t%d\n", max(x, y, z));
      System.out.format("Min value: \t\t%d\n", min(x, y, z));
      System.out.format("Average value: \t%f\n", average(x, y, z));

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }


  }

  public static double average(int x, int y, int z) {
    return (x + y + z) / 3.;
  }

  public static int min(int x, int y, int z) {
    return Math.min(Math.min(x, y), Math.min(y, z));
  }

  public static int max(int x, int y, int z) {
    return Math.max(Math.max(x, y), Math.max(y, z));
  }

}
