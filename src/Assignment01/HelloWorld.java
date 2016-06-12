package Assignment01;

import java.util.Scanner;

// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Assignment: 1

public class HelloWorld
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");
    }
}

