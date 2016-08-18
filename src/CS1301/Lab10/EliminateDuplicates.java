package CS1301.Lab10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 10

import java.util.*;

public class EliminateDuplicates {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      int[] list = new int[10];

      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < 10; i++) {
        list[i] = scanner.nextInt();
      }

      int[] list2 = eliminateDuplicates(list);

      System.out.print("The distinct numbers are: ");
      for (int i = 0; i < list2.length; i++) {
        System.out.print(i + " ");
      }

      System.out.println();

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  public static int[] eliminateDuplicates(int[] list) {

    // Really tripping over Java here but I do understand how to do this.

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < list.length; i++) {
      set.add(list[i]);
    }

    int[] a = new int[set.size()];
    int i = 0;
    for (Integer val : set) a[i++] = val;
    return a;

  }

}
