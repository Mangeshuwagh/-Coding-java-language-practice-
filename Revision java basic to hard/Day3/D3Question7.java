// // Q7. Write Program to create class name as ArrAbs with two methods  
// //  void setArray(int arr[],int []): this function is used for accept array as parameter 
// // abstract int [] getResultantArray(): this function can return resultant array from different child 
// // classes. 
// // You have to create two classes name as  InterSection you have to override getResultantArray() 
// // method in Intersection and perform intersection of array which we pass in setArray() function and 
// // return it as well as you have to create one more class name as Union you have to override 
// // getResultantArray() and perform union on two array and return resultant array

import java.util.Scanner;

/**
 * D3Question7
 */
abstract class ArrAbs {

    int a[], b[];

    public void setArray(int a[], int b[]) {
        this.a = a;
        this.b = b;
    }

    abstract int[] getResultantArray();

}

class InterSection extends ArrAbs {
    public int[] getResultantArray() {

        int temp[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    temp[k++] = a[i];
                    break;
                }
            }
        }

        int bb[] = new int[k];
        for (int i = 0; i < k; i++) {
            bb[i] = temp[i];
        }
        return bb;
    }
}

class Union extends ArrAbs {

    public int[] getResultantArray() {
        int temp[] = new int[a.length + b.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            temp[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    flag = 1;

                    break;
                }
            }
            if (flag == 0) {
                // System.out.println();
                temp[k++] = b[i];
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        return result;
    }

}

public class D3Question7 {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 1st array elments: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Enter the 2nd array elements:");
        for (int i = 0; i < b.length; i++) {
            b[i] = cin.nextInt();
        }

        InterSection i = new InterSection();
        i.setArray(a, b);
        int[] mm = i.getResultantArray();
        System.out.println("Show the inter section aaray elements: ");
        for (int j = 0; j < mm.length; j++) {
            System.out.print(" " + mm[j]);
        }
        System.out.println(" show the Unioun program: ");

        Union u = new Union();
        u.setArray(a, b);
        int uu[] = u.getResultantArray();
        for (int k = 0; k < uu.length; k++) {
            System.out.print(uu[k] + " ");
        }

    }
}