// Write a C program to check whether a triangle is valid or not if angles are given using if else. How to 
//  whether a triangle can be formed or not, if its angles are given using if else in C programming.
//   Logic to check triangle validity if angles are given in C program.
// Example
// Input 
// Input first angle: 60
// Input second angle: 30
// Input third angle: 90
// Output
// The triangle is valid

import java.util.Scanner;

public class Quetion9 {

    public static void main(String[] args) {

        int a, b, c;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the three angle of trianle ");
        System.out.println("Enter the first angle");
        a = cin.nextInt();
        System.out.println("Enter the second angle");
        b = cin.nextInt();
        System.out.println("Enter the third angle");
        c = cin.nextInt();
        if (a + b + c == 180) {
            System.out.println("Triangle is Valid: angle A ,B, And C: " + a + " " + b + " " + c);
        } else {
            System.out.println("Trianlge is not valid");
        }
    }
}
