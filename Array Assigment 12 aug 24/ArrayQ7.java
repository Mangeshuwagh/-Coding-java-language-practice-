// // 7)	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
// // There is no element next to the last element, therefore replace it with -1. 

// // Input- Original Array 
// // [45, 20, 100, 23, -5, 2, -6]
// // Output- The modified array:
// // [100, 100, 23, 2, 2, -6, -1]
import java.util.Scanner;

public class ArrayQ7 {
    public static void main(String[] args) {
        int a[] = new int[7];
        System.out.println("Enter the 6 elements in the array: ");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        // logic
        int max = a[a.length - 1]; // last value assighnt max variable
        a[a.length - 1] = -1;// last the store the -1 value

        for (int i = a.length - 2; i >= 0; i--) {// there are revers the are start
            int temp = a[i]; // assigh the value in the temp
            a[i] = max; // asighnt the max value
            if (temp > max) {// check the max value
                max = temp;// max value assighn value
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

}

// public class ArrayQ7 {
// public static void main(String[] args) {
// int a[] = new int[7];
// System.out.println("Enter the 6 elements in the array: ");
// Scanner cin = new Scanner(System.in);
// for (int i = 0; i < a.length; i++) {
// a[i] = cin.nextInt();
// }
// // logic

// for (int i = 0; i < a.length; i++) {
// for (int j = i + 1; j < a.length; j++) {
// if (a[i] < a[j]) {
// a[i] = a[j];
// }
// }
// }
// for (int i = 0; i < a.length; i++) {
// System.out.print(" " + a[i]);
// }
// }

// }
