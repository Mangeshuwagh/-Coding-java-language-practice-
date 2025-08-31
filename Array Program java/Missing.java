// 5). Write a program to enter the 5 values in ascending order and store in array and find out the 
// missing element from array? 
// a[0]                                a[1]                        a[2]                              a[3]                         a[4]  
// 1 5 9 13 17 

// Missing elements : output should like as   
// 2 3 4 6 7 8 10 11 12 14 15 16

import java.util.*;

public class Missing {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 Elements in the asending the order: \n");
        for (int i = 0; i < a.length; i++) {

            a[i] = cin.nextInt();
        }
        // Missing the value : \n

        System.out.println("Show the missing the value : \n");

        for (int i = 0; i < a.length; i++) {
            int Diff = a[i + 1] - a[i];

            if (Diff > 1) {
                int cout = a[i];

                while (cout < (a[i + 1] - 1)) {
                    ++cout;
                    System.out.print("\t" + cout);

                }
            }
        }

        // for (int i = 0; i < a.length; i++) {

        // int Start = a[i] + 1;
        // int End = a[i + 1];

        // for (int j = Start; j < End; j++) {
        // System.out.print("\t" + j);
        // }
        // }

    }

}
