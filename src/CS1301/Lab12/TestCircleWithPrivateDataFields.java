package CS1301.Lab12;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 12

public class TestCircleWithPrivateDataFields {
    /** Main method */
    public static void main(String[] args) {
        // Create a Circle with radius 5.0
        CircleWithPrivateDataFields myCircle =
                new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());

        CircleWithPrivateDataFields yourCircle = new CircleWithPrivateDataFields(40);
        System.out.println("The area of the circle of radius "
                + yourCircle.getRadius() + " is " + yourCircle.getArea());
        yourCircle.setRadius(yourCircle.getRadius() * 1.4);
        System.out.println("The area of the circle of radius "
                + yourCircle.getRadius() + " is " + yourCircle.getArea());
        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());

    }
}