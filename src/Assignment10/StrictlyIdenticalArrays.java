package Assignment10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 10

import java.util.Scanner;

public class StrictlyIdenticalArrays {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    while (true) {

      int[] list1 = gatherList("List 1", 10);
      int[] list2 = gatherList("List 2", 10);

      if (equals(list1, list2)) {
        System.out.println("Two lists are strictly identical");
      } else {
        System.out.println("Two lists are not strictly identical");
      }

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  private static int[] gatherList(String listName, int listLength) {
    int[] list = new int[listLength];

    System.out.printf("Enter %d numbers for %s: ", listLength, listName);

    for (int i = 0; i < listLength; i++) {
      list[i] = scanner.nextInt();
    }

    return list;
  }

  public static boolean equals(int[] list1, int[] list2) {
    // Heuristic: If they have differing lengths they can't be the same so
    // don't bother checking elements.
    if (list1.length != list2.length) {
      return false;
    }

    for (int i = 0; i < list1.length; i++) {
      if (list1[i] != list2[i]) return false;
    }

    return true;
  }

}
