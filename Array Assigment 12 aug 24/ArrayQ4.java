
// // 4)	 Write a Java program to cyclically rotate a given array clockwise by n.  
// // Input- 1 2 3 4 5 6
// // Rotate array by 1
// // Output-6 1 2 3 4 5
// // Rotate array by 3
// // Output-4 5 6 1 2 3 

import java.util.Scanner;
// Clockwise roted

public class ArrayQ4 {
    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the 5 elements in the array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        System.out.println("Enter the index and Roted the array: \n");
        int index = cin.nextInt();
        cin.close();
        index = index % a.length;
        int j;

        for (int i = 0; i < index; i++) {
            int first = a[0];

            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }

            a[a.length - 1] = first;
        }

        System.out.println(" Print the array roateded");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}
// import java.util.Scanner;

// public class ArrayQ4 {
// public static void main(String[] args) {
// int a[] = new int[5];
// Scanner cin = new Scanner(System.in);

// System.out.print("Enter the 5 elements in the array: ");
// for (int i = 0; i < a.length; i++) {
// a[i] = cin.nextInt();
// }

// System.out.print("Enter the index to rotate the array by: ");
// int index = cin.nextInt();
// cin.close(); // Close the scanner to prevent resource leaks

// // Normalize the index to ensure it's within the array bounds
// index = index % a.length; // Handle cases where index >= length

// // Rotate the array by the given index
// for (int i = 0; i < index; i++) {
// // Store the first element
// int first = a[0];

// // Shift elements to the left
// for (int j = 0; j < a.length - 1; j++) {
// a[j] = a[j + 1];
// }

// // Move the first element to the end
// a[a.length - 1] = first;
// }

// System.out.println("Array after rotation:");
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
