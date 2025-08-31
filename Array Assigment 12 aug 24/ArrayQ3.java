// 3)	Write a Java program to find the smallest and second smallest elements of a given array. 

import java.util.Scanner;

public class ArrayQ3 {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the 5 elments ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println(" Smallest elements: " + a[a.length - 1]);
        System.out.println("Second Smallest numbers " + a[a.length - 2]);
    }

}
