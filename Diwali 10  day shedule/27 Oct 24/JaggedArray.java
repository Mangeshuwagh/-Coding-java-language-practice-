// public Q2. WAP to create the Jagged array array and print the follwing matrix in java
// 1 2 3
// 4 5
// 7 8 9 19 {

// }

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {

        int[][] a = new int[3][];
        a[0] = new int[3];
        a[1] = new int[2];
        a[2] = new int[4];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Element in the Array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = cin.nextInt();
            }
        }

        System.out.println("print the jagged Array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // a[i][j] = cin.nextInt();
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }

}