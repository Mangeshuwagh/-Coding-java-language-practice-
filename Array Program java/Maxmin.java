// 2) WAP to enter the five elements in array and find out the maximum and minimum elements  
// a[0]   a[1]   a[2]  a[3]   a[4] 
// Output like as  
// Maximum element in array  : 11 
// Minimum element in array  :  4

import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Enter the 5 element in the array: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int b, c;
        if (a[0] > a[1]) {
            b = a[0];
            c = a[1];
        } else {
            b = a[1];
            c = a[0];
        }

        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                b = a[i];
            } else if (c > a[i]) {
                c = a[i];
            }

        }
        System.out.println("MAX =" + b + "\n Min =" + c);
    }

}
