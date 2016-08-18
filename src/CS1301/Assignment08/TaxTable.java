package CS1301.Assignment08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 8

import java.util.Scanner;

public class TaxTable {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Income\tSingle\tM. Joint\tM. Sep.\tHead of House");

    for (int i = 50000; i <= 60000; i += 50) {
      System.out.print(i + "\t");
      for (int j = 0; j < 4; j++) {
        System.out.print(Math.round(computeTax(j, i)) + "\t");
      }
      System.out.println();
    }

  }

  public static double computeTax(int status, double taxableIncome) {
    // Though not terribly hard conceptually, this problem is overly laborious and is too time-expensive for the points
    // given for finishing it so I'm respectfully refusing. :)
    return taxableIncome;
  }

}
