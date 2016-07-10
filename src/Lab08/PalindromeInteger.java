package Lab08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 8

import java.util.Scanner;

public class PalindromeInteger {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter an integer: ");
      int num = scanner.nextInt();
      System.out.println("Is Palindrome? " + isPalindrome(num));

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  private static Boolean isPalindrome(int number) {

    // Convert integer to String
    String numberStr = Integer.valueOf(number).toString();

    return numberStr.equals(reverse(numberStr));
  }

  private static String reverse(String numberStr) {
    return new StringBuilder(numberStr).reverse().toString();
  }

}
