// Q2. WAP to create class name as MergeArray with two functions 
// void acceptArray(int a[],int b[]): this function accept two array as parameter and merge them and store in third array
// void showArray(): this function can show the merged array

import java.util.Scanner;

class Array {
    int arr[], arr2[];
    int arr3[];

    void acceptArray(int a[], int b[]) {
        arr = a;
        arr2 = b;
        int tempp = arr.length + arr2.length;
        arr3 = new int[tempp];
    }

    void showArray() {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[k] = arr[i];
            k++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[k] = arr2[j];
            k++;
        }

        System.out.println("Show the array : \n");
        for (int i = 0; i < k; i++) {
            System.out.print("\t" + arr3[i]);
        }
    }
}

public class mergearray {

    public static void main(String[] args) {
        int ar[] = new int[5];
        int ar2[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 1st array Elements: \b");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = cin.nextInt();

        }
        System.out.println("Enter the 2nd array Elements: \b");
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = cin.nextInt();

        }
        Array a = new Array();
        a.acceptArray(ar, ar2);
        a.showArray();
    }
}
