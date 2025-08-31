// 29) Write a program in C to find a pair with the given difference 
// Expected Output: 
// The given array is: 
// 1 15 39 75 92 
// The given difference is: 53 
// The pair are: (39, 92)

import java.util.*;

public class Pair29 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        System.out.println("Show the all array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.println("\t" + a[i]);
        }
        System.out.println("\n");
        // int flag;
        for (int i = 0; i < a.length; i++) {
            // flag=0;
            // System.out.println("\t"+a[i]);
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] - a[i] == 53) {
                    // flag=1;
                    System.out.println(" The pair are:(" + a[i] + "," + a[j] + ")");
                    break;
                }

            }
        }
    }

}
