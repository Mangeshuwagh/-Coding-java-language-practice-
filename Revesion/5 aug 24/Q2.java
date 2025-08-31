// public 2.Write a C program to find maximum between three numbers {

// }

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        // int a, b, c;
        int a[] = new int[3];
        System.out.println("Enter the tree numbrs: ");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Max number: " + max);
    }

}