// Write a C program to input sides of a triangle and check whether a
//  triangle is equilateral, scalene or isosceles triangle using if else.
//   How to check whether a triangle is equilateral, scalene or isosceles triangle in C programming. \
//  Logic to classify triangles as equilateral, scalene or isosceles triangle if sides are given in C program.
// Example
// Input
// Input first side: 30
// Input second side: 30
// Input third side: 30
// Output
// Triangle is equilateral triangle

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
        a = cin.nextInt();
        System.out.println("Enter the second angle: ");
        b = cin.nextInt();
        System.out.println("Enter the third angle: ");
        c = cin.nextInt();
        System.out.println(" Angles of trianlges: " + a + " " + b + " " + c);
        // if ((a == b) && (b == c) && (c == a)) {

        //     System.out.println("Trianle is Equilateral trianle ");

        // } else {
        //     System.out.println("Triangle is not Equilaterral trianle");
        // }
        if (a + b > c && b + c > a && c + a > b) {
            // Check for equilateral triangle
            if (a == b && b == c) {
                System.out.println("Triangle is an Equilateral triangle.");
            }
            // Check for isosceles triangle
            else if (a == b || b == c || c == a) {
                System.out.println("Triangle is an Isosceles triangle.");
            }
            // If neither equilateral nor isosceles, it must be scalene
            else {
                System.out.println("Triangle is a Scalene triangle.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

    }
}
