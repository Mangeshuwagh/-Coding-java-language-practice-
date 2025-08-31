// Q1. WAP to find the occurence of array

/**
 * Occurence
 */

//  arr : 1 2 3 4 1 2 3 2 2 2 
//   input 2 
//  outpurt 5;
import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {

        int a[] = new int[7];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the elemete in the array:  ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("Show the Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\nEnter the number u want search in the array: ");
        int search = cin.nextInt();
        boolean f = false;
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == search) {
                count++;
                f = true;

            }
        }
        if (f) {

            System.out.println("element find  the in the array : Occurence  " + count);
        } else {
            System.out.println("its not found in the array : ");
        }
        // System.out.println("Hello dear Damini");

    }

}