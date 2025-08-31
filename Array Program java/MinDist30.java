
// 0) Write a program in C to find the minimum distance between two numbers in a given array. 
// Expected Output: 
// The given array is: 
// 7 9 5 11 7 4 12 6 2 11 
// The minimum distance between 7 and 11 is: 1 

import java.util.*;

public class MinDist30 {
    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the array: \n");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Show the array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.println("\t" + a[i]);
        }

        int num1 = 7, num2 = 11;
        int minDist = Integer.MAX_VALUE;

        int lastPosition = -1, lastPosition2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num1) {
                lastPosition = i;
                if (lastPosition2 != -1) {
                    minDist = Math.min(minDist, i - lastPosition2);

                }
                if (a[i] == num2) {

                    lastPosition2 = i;
                    if (lastPosition != -1) {
                        minDist = Math.min(minDist, i - lastPosition);
                    }
                }
            }
        }
        if (minDist == Integer.MAX_VALUE) {
            System.out.println("One or both of the numbers are not present in the array.");
        } else {
            System.out.println("The minimum distance between " + num1 + " and " + num2 + " is: " + minDist);
        }

    }

}
