
// 10)	 Write a Java program to shuffle a given array of integers.
//  (to shuffle an array using the Fisher-Yates algorithm also you can
//   use Random class from java.util.*;  package and their methods)
// Example:
// Input :
// nums = { 1, 2, 3, 4, 5, 6 }
// Output:
// Shuffle Array: [4, 2, 6, 5, 1, 3]
import java.util.Scanner;
// import java.math.*;
// import java.util.rando;
import java.util.Random;

public class ArrayQ10 {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6 };
        Random rand = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        System.out.print("Shuffle Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}