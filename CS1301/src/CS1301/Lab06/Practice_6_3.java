package CS1301.Lab06;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 6

public class Practice_6_3 {

  public static void main(String[] args) {

    String evenNumbers = "";
    String oddNumbers = "";

    int i = 50;

    while (i <= 100) {
      String trail = (i > 98) ? "" : ", ";
      // This approach thrashes memory because new Strings are created every time and old ones
      // must be garbage collected. But it's the simplest approach and this chapter is about
      // loops, not memory economics.
      if (i % 2 == 0) {
        evenNumbers += i + trail;
      } else {
        oddNumbers  += i + trail;
      }

      i++;
    }

    System.out.println("Even numbers between 50 and 100:\t" + evenNumbers);
    System.out.println("Odd numbers between 50 and 100: \t" + oddNumbers);

  }

}
