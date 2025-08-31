// 25) Write a program in C to find out the maximum difference between any two elements such that 
// larger element appears after the smaller number. 
// Expected Output : 
// The given array is : 7 9 5 6 13 2 
// The elements which provide maximum difference is: 5, 13 
// The Maximum difference between two elements in the array is: 8

import java.util.Scanner;

public class Different {
    public static void main(String[] args) {

        int a[] = new int[6];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 elements in the array : \n");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int no1 = 0, no2 = 0;

        // System.out.println("Enter the two number you want the differnte show : \n");

        // System.out.println("Enter the 1st number: \n");
        // no1 = cin.nextInt();
        // System.out.println("number second\n");
        // no2 = cin.nextInt();
        int diff = a[1] - a[0];
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] - a[i] > diff) {
                    diff = a[j] - a[i];
                    no1 = a[i];
                    no2 = a[j];
                }
            }
        }

        System.out.print("\nThe elements which provide maximum difference is:\t " + no1 + "\t\t\t" + no2);

        System.out.println("\n Differnt between an the array: \n" + diff);

    }

}
