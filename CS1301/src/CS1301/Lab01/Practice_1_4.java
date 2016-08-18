package CS1301.Lab01;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 1.4

public class Practice_1_4 {

    /**
     * Write a java program (name it CS1301.Lab01.Practice_1_4) to display the area and perimeter of
     * a rectangle with width = 4 and height = 8. Use proper labels for the outputs.
     */
    public static void main(String[] args) {
        int WIDTH = 4;
        int HEIGHT = 8;

        System.out.format("    Width: %d\n", WIDTH);
        System.out.format("   Height: %d\n", HEIGHT);
        System.out.format("Perimeter: %d\n", WIDTH * 2 + HEIGHT * 2);
    }
}
