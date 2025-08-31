// 1. Write program to input two values using command line argument and perform its swapping? 

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        int a, b;

        System.out.println("Enter the 1st number and second number");
        Scanner cin = new Scanner(System.in);
        a = cin.nextInt();
        b = cin.nextInt();

        System.out.println(" a : " + a + "\n b : " + b);
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println("Swaping the numbers ");
        System.out.println(" a : " + a + "\n b : " + b);
    }
}