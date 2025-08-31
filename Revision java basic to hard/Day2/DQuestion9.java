// Q8. Write program to create class name as MergeTwoArray with parameterized constructor  
// MergeTwoArray(int [],int []): this constructor accept two array as parameter 
// int [] getMergeArray(): this function merge two array in third array and return new merged array

import java.util.*;

class MergeTwoArray {
    public int a[], b[];

    MergeTwoArray(int a[], int b[]) {
        this.a = a;
        this.b = b;
    }

    public int[] getMergeArray() {
        // int third=a.length+b.length;

        int c[] = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            c[k] = a[i];
            k++;
        }
        for (int j = 0; j < b.length; j++) {
            c[k] = b[j];
            k++;
        }

        return c;

    }

}

public class DQuestion9 {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        System.out.println("Enter the 1st array Elments: ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("enter the 2nd in the 5 elements: ");

        for (int i = 0; i < b.length; i++) {
            b[i] = cin.nextInt();
        }

        // int len=a.length+b.length;
        MergeTwoArray m = new MergeTwoArray(a, b);

        System.out.println("show the merge two array: \n");
        int c[] = m.getMergeArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }

    }
}
