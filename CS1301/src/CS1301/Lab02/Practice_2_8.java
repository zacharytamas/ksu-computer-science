package CS1301.Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

public class Practice_2_8 {

    public static void main(String[] args) {
        System.out.println("a     b     pow(a, b)");
        printRow(1, 2);
        printRow(2, 3);
        printRow(3, 4);
        printRow(4, 5);
        printRow(5, 6);
    }

    public static void printRow(int a, int b) {
        System.out.format("%d     %d     %d\n", a, b, (int) Math.pow(a, b));
    }

}
