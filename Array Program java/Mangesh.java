
// 21) Write a program in C to find if a given integer x appears more than n/2 times in a sorted array 
// of n integers ? 
// Expected Output : 
// The given array is : 1 3 3 5 4 3 2 3 3 
// The given value is : 3 
// 3 appears more than 4 times in the given array[] 

import java.util.*;

public class Mangesh {

    public static void main(String[] args) {
        int a[] = new int[9];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 9 Elements: \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        System.out.println("Show the array:  \n");
        for (int i = 0; i < a.length; i++) {
            // a[i]=cin.nextInt();
            System.out.println(" " + a[i]);
        }
        // logic Start:::::
        int no;
        System.out.println("Enter the number you search and how many time in the array: \n");
        no = cin.nextInt();
        int count = 0;
        int mid = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            if (no == a[i]) {
                count++;

            }

        }
        if (count > mid) {
            count = count - 1;
            System.out.println(no + "  appears more than " + count + " times in the given array[]");
        }
    }
}
