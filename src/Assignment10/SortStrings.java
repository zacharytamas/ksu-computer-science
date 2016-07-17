package Assignment10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 10

import java.util.Scanner;

public class SortStrings {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Let's sort some names! How many are there? ");
      int nameCount = scanner.nextInt();

      String[] names = new String[nameCount];
      scanner.nextLine();  // clear the buffer

      for (int i = 0; i < nameCount; i++) {
        System.out.printf("Name %d: ", i + 1);
        names[i] = scanner.nextLine();
      }

      System.out.println();
      System.out.println("Names before sort:");

      for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
      }

      System.out.println();

      selectionSort(names);

      System.out.println("Names After sort:");

      for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
      }

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  public static void selectionSort(String[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      String currentMin = list[i];
      int currentMinIndex = i;
      for (int j = i + 1; j < list.length; j++) {
        if (currentMin.compareTo(list[j]) > 0) {
          currentMin = list[j];
          currentMinIndex = j;
          // Swap list[i] with list[currentMinIndex] if necessary
          if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
        }
      }
    }
  }

}
