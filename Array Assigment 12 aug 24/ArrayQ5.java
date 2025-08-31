// 5)	 Write a Java program to cyclically rotate a given array anti-clockwise by n.  
// Input- 1 2 3 4 5 6
// Rotate array by 1
// Output- 2 3 4 5 6 1
// Rotate array by 2
// Output- 5 6 1 2 3 4

import java.util.Scanner;

public class ArrayQ5 {

    public static void main(String[] args) {

        System.out.println("Enter the 6 elements in the array: \n");

        int arr[] = new int[6];
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();

        }
        System.out.println("Enter the index roated Anit-clockwise");
        int index=cin.nextInt();
        index = index % arr.length;

    }
}
