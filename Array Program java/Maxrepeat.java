
// 27) Write a program in C to find the maximum repeating number in a given array. 
// The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n.. 
// Expected Output: 
// The given array is: 
// 2 3 3 5 3 4 1 7 7 7 7 
// The maximum repeating number is: 7 

import java.util.*;

public class Maxrepeat {
    public static void main(String[] args) {

        int a[] = new int[11];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 11 Elements In the Array: \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int count = 0;
        int store = 0;
        for (int i = 0; i < a.length; i++) {
            count=0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
count++;
store=a[i];
                }
            }
        }
    }

}
