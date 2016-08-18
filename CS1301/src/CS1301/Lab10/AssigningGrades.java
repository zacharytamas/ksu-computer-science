package CS1301.Lab10;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 10

import java.util.Scanner;

public class AssigningGrades {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("Enter the number of students: ");
      int numStudents = scanner.nextInt();

      int[] scores = new int[numStudents];

      System.out.printf("Enter %d scores: ", numStudents);

      for (int i = 0; i < numStudents; i++) {
        scores[i] = scanner.nextInt();
      }

      int max = best(scores);

      for (int i = 0; i < numStudents; i++) {
        System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], gradeFor(max, scores[i]));
      }

      System.out.print("\nAgain? y/n ");
      if (scanner.next().toLowerCase().charAt(0) == 'n') break;
    }

  }

  public static int best(int[] scores) {
    int highest = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > highest) highest = scores[i];
    }
    return highest;
  }

  public static char gradeFor(int best, int score) {
    if (score >= (best - 10)) {
      return 'A';
    } else if (score >= (best - 20)) {
      return 'B';
    } else if (score >= (best - 30)) {
      return 'C';
    } else if (score >= (best - 40)) {
      return 'D';
    } else {
      return 'F';
    }
  }

}
