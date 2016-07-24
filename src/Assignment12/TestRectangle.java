package Assignment12;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment 12

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 5);

        Rectangle[] rects = {rect1, rect2};

        for (int i = 0; i < rects.length; i++) {
            Rectangle rect = rects[i];
            System.out.println("Assignment12.Rectangle #" + (i + 1));
            System.out.printf("Width: %.1f\n", rect.width);
            System.out.printf("Height: %.1f\n", rect.height);
            System.out.printf("Area: %.3f\n", rect.getArea());
            System.out.printf("Perimeter: %.1f\n", rect.getPerimeter());
            System.out.println();
        }

    }

}
