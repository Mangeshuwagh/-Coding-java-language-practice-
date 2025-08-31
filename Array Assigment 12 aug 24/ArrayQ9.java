
// 9)	Write a Java program to find the maximum product of two integers in a given array of integers.  
// Example:
// Input :
// nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
// Output:
// Pair is (7, 8), Maximum Product: 56
import java.util.Scanner;

public class ArrayQ9 {
    public static void main(String[] args) {
        int a[] = new int[8];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 8 elements in the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        int max;
        int smax;
        if (a[0] > a[1]) {
            max = a[0];
            smax = a[1];
        } else {
            max = a[1];
            smax = a[0];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                smax = max;
                max = a[i];
            }

        }
        int Tprdut = smax * max;
        System.out.println("pair is (" + smax + "," + max + "), Maximum Product : " + Tprdut);
    }

}
