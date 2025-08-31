
// 13) Write a program in C to find the majority element of an array ? 
// A majority element in an array A[] of size n is an element that appears more than n/2 times (and 
// hence there is at most one such element). 
// Expected Output : 
// The given array is : 4 8 4 6 7 4 4 8 
// There are no Majority Elements in the given array

import java.util.*;

public class ArrayMajority {
    public static void main(String[] args) {

        // int a[]={4,8,4,6,7,4,4,8};
        int a[] = new int[8];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Elements in the array: \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Show the array : \n");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\t");
            // a[i] = cin.nextInt();

        }

        int mid = a.length / 2;
        int count = 0;
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            flag = 0;
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
            }
            if (count > mid) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Array is the Majority: \n");

        } else {
            System.out.println("Array is not majority: \n");
        }
    }
}
