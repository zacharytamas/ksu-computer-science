package Lab08;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 8


public class ComputeCommissions {

  public static void main(String[] args) {

    for (int i = 10000; i <= 100000; i += 5000) {
      System.out.format("%d\t\t%.1f\n", i, computeCommission(i));
    }

  }

  public static double computeCommission(double salesAmount) {

    double commission = 0;

    if (salesAmount > 10000) {
      double surplus = salesAmount - 10000;
      commission += surplus * .12;
      salesAmount = 10000;
    }

    if (salesAmount > 5000) {
      double surplus = salesAmount - 5000;
      commission += surplus * .1;
      salesAmount = 5000;
    }

    commission += salesAmount * .08;

    return commission;
  }

}
