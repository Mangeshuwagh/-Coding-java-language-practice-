// 6)	 Write a Java program to separate even and odd numbers from a given array of integers. 
// Put all even numbers first, and then odd numbers.  
// Input – 20 12 23 17 7 8 10 2 1 0
// Output- 20 12 0 2 10 8 7 17 1 23

import java.util.Scanner;

public class ArrayQ6 {

    public static void main(String[] args) {
        int a[] = new int[10];

        System.out.println("Enter the 10 elements in the array: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        // logic start even the number first means 2 , 4,6,8 someting and odd = 3,5,7,9,
        // the last move
        int ar[] = new int[10];
        int even = 0;
        int odd = ar.length - 1;

        for (int i = 0; i < ar.length; i++) {
            if (a[i] % 2 == 0) {
                ar[even++] = a[i];

            } else if (a[i] % 2 == 1) {
                ar[odd--] = a[i];

            }

        }
        for (int i = 0; i < ar.length; i++) {
            a[i] = ar[i];

        }
        System.out.println(" show the array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

}
