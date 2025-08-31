
// 2)	Given two sorted arrays nums1 and nums2 of size m and n respectively, 
// return the median of the two sorted arrays.

// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
import java.util.Scanner;

class Sort {

    private int arr[];
    private int a1[], a2[];
    private int lenght;

    public void SetMerg(int a[], int b[]) {
        lenght = a.length + b.length;

        a1 = a;
        a2 = b;
        int k = 0;

        int arr[] = new int[lenght];
        for (int i = 0; i < a1.length; i++) {
            arr[k] = a1[i];
            k++;
        }
        for (int i = 0; i < a2.length; i++) {
            arr[k] = a2[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
        // sort array :
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(" Show the sort array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public void showMedia() {

        double median;
        if (lenght % 2 == 0) {
            // median=(median/2)
            median = (arr[lenght / 2 - 1] + arr[lenght / 2]) / 2;
        } else {
            median = arr[lenght / 2];
        }
        System.out.println(" median : " + median);
    }
}

public class ArrayQ2 {
    public static void main(String[] args) {

        int nu1[] = { 1, 3 };
        int nu2[] = { 2 };
        Sort s = new Sort();
        s.SetMerg(nu1, nu2);
        s.showMedia();
    }
}
