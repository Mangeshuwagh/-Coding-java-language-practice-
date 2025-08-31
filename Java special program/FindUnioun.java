// Example:  WAP to create class FindUnion with two methods 
// void setArray(int a[],int b[]): this method can accept two array as parameter 
// int [] getUnionArray(): this method can perform union operation on array and return resultant array

import java.util.Scanner;

class union {
    private int a[], b[];
    private int get[];

    public void setArray(int[] ar, int[] brr) {
        a = ar;
        b = brr;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            get[k] = a[i];
            k++;
        }

        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            int j;
            for (j = 0; j < b.length; j++) {

                if (get[i] == b[j]) {

                    found = true;
                    break;

                }

            }
            if (found == true) {
                get[k] = b[i];
                k++;

            }
        }

        // int[] temp = new int[k];
        // for (int i = 0; i < k; i++) {
        // temp[i] = get[i];
        // }
        // get = temp;

    }

    public int[] getUnionArray() {
        return get;
    }

}

public class FindUnioun {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];

        union u = new union();
        u.setArray(a, b);
        System.out.println("Show the array: \n");
        int c[] = u.getUnionArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(" \t" + c[i]);
        }

    }
}
