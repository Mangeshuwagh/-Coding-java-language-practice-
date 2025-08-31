
// 7) WAP to enter the 10 element array and print the occurrence of every element ? 
// a[0]    a[1]          a[2]           a[3]          a[4]          a[5]           a[6]        a[7]          a[8]          a[9] 
// 10 20 30 10 20 50 30 10 30 10 
// Output : 
// Element  count 
// 10  --------------------      4 
// 20  --------------------      2 
// 30  --------------------       3 
// 50  ------------------         1

import java.util.*;

public class occurrence {
    public static void main(String[] args) {
        int a[] = new int[10];

        System.out.println("Enter the 10 Elements In the array: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int count = 0;
        // Logic Start Here
        for (int i = 0; i < a.length; i++) {
            // a[i] = cin.nextInt();
            for (int j = i + 1; j < a.length; j++) {
                count = 1;
                if (a[i] == a[j]) {
                    count++;
                    a[j] = -1;

                }

                // a[i]=cin.nextInt();
            }
            System.out.println(a[i] + "....\t" + count);
        }

    }

}
