// Q1. WAP to print the fibonacii series using arra

import java.util.Scanner;

public class Program1st {
    // 1,1,2,3,5,8,13,21,

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Limit you want the store in the Arrya: fibbo Series: ");

        // int k = 0;

        // k++;
        // k++;
        int limit = cin.nextInt();
        int ar[] = new int[limit];
        int n0 = 0, n1 = 1, n3;
        ar[0] = n0;
        ar[1] = n1;
        int b;
        for (int i = 2; i < limit; i++) {

            n3 = n0 + n1;
            ar[i] = n3;
            n0 = n1;
            n1 = n3;

        }
        System.err.println("Show the Fiboni series: ");

        for (int i = 0; i < limit; i++) {
            System.out.print(" " + ar[i]);
        }

    }

}