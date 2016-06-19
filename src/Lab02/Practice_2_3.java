package Lab02;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 2

import java.util.Scanner;

public class Practice_2_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable declaration section
        byte byte_value;
        short short_value;
        int int_value;
        long long_value;
        float float_value;
        double double_value;

        // Read and print byte
        System.out.print ("Enter byte value: ");
        byte_value = input.nextByte();
        System.out.println ("The byte value is:\t\t" + byte_value);

        // Read and print short
        System.out.print ("Enter short value: ");
        short_value = input.nextShort();
        System.out.println ("The short value is:\t\t" + short_value);

        // Read and print int
        System.out.print ("Enter int value: ");
        int_value = input.nextInt();
        System.out.println ("The int value is:\t\t" + int_value);

        // Read and print long
        System.out.print ("Enter long value: ");
        long_value = input.nextLong();
        System.out.println ("The long value is:\t\t" + long_value);

        // Read and print float
        System.out.print ("Enter float value: ");
        float_value = input.nextFloat();
        System.out.println ("The float value is:\t\t" + float_value);

        // Read and print double
        System.out.print ("Enter double value: ");
        double_value = input.nextDouble();
        System.out.println ("The double value is:\t\t" + double_value);

    }

}
