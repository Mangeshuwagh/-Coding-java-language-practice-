// // 1.Write a C program to find maximum between two numbers.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the two numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        int max = (a > b) ? a : b;

        int min = (a < b) ? a : b;
        System.out.println(" Max " + max);
        System.out.println(" MIn " + min);
    }
}
// import java.util.Scanner;

// public class Q1 {
// public static void main(String[] args) {
// int a, b;
// Scanner input = new Scanner(System.in);

// System.out.println("Enter the two numbers: ");
// a = input.nextInt();
// b = input.nextInt();

// int max = (a > b) ? a : b;
// int min = (a < b) ? a : b;

// System.out.println("Max: " + max);
// System.out.println("Min: " + min);
// }
// }
