
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 10

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrences {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter ten integers between 1 and 100: ");
      Integer[] array = new Integer[10];
      // Let's use a Hashtable because calculating this later by searching the array over
      // and over is horrible. I guess since we know the array will only be ten elements
      // long, even a worst case would probably perform acceptably but it hurts me.
      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < 10; i++) {
        array[i] = scanner.nextInt();
        int count = map.getOrDefault(array[i], 0);
        map.put(array[i], count + 1);
      }

      // Now that I think about it, using the map this way essentially makes the Array
      // uneccesary but I've left it here so that you know I do know how to use arrays. :P

      for (int number : map.keySet()) {
        int count = map.get(number);
        System.out.printf("%d occurs %d time%s\n", number, count, (count == 1) ? "" : "s" );
      }

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

}
