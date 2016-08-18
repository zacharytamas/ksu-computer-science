package CS1301.Assignment06;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 6

import java.util.Scanner;

public class PasswordTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter a password for verification: ");

      String password = scanner.next();

      Boolean longEnough = password.length() >= 8;
      Boolean hasLowerCase = false;
      Boolean hasUpperCase = false;
      Boolean hasDigit = false;
      Boolean hasSpecialChar = false;

      if (longEnough) {  // don't bother checking if it can't possibly be valid
        for (int i = 0; i < password.length(); i++) {
          char ch = password.charAt(i);

          // These following values are based on ASCII values for the characters. I could have used Regular
          // Expressions but this is performant enough and depending on how smart Java's compiler is (again,
          // not my primary language) this is likely optimizeable by the compiler.
          if (ch >= 65 && ch <= 90) hasUpperCase = true;
          else if (ch >= 97 && ch <= 122) hasLowerCase = true;
          else if (ch >= 48 && ch <= 57) hasDigit = true;
          else hasSpecialChar = true;
        }
      }

      Boolean valid = longEnough && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;

      System.out.format("Entered password: %s\n", password);
      System.out.format("Verdict:          %s\n", (valid) ? "Valid" : "Invalid");

      System.out.println();
      System.out.print("Would you like to check another? y/n ");

      if (scanner.next().toLowerCase().charAt(0) == 'n') break;


    }

  }

}
