
// Write a C Program to input two angles from user and find third 
// angle of the triangle. How to find all angles of a triangle 
// if two angles are given by user using C programming. 
// C program to calculate the third angle of a triangle if two angles are given.
// ExampleInput
// Enter first angle: 60
// Enter second angle: 80
// Output
// Third angle = 40

import java.security.SecureClassLoader;
import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Enter the first angle ");
        // System.out.println("Enter the first angle ");
        Scanner cin = new Scanner(System.in);

        a = cin.nextInt();
        System.out.println("Enter the Second angle ");
        b = cin.nextInt();
        c = 180 - (a + b);
        System.out.println("third angle is: " + c);
    }
}
