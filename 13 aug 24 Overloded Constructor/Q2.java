// // Example: WAP to create class name as SubArrSum with constructor and one method 
// // SubArrSum(int a[],int sumValue): this method can accept array as parameter and one single value as sum
// // void findSubArr(): this method can find the sum array whose sum is equal with sum value provide by user.

// // Example: 1    5   2   5  4  8
// // User provided value : 12 
// // Index of sub array 1  and 3   and you sub array is  5  2  5

import java.util.Scanner;

class SubArrSum {
    private int a[];
    private int sum;

    SubArrSum(int a[], int sum) {
        this.a = a;
        this.sum = sum;

    }

    public void findSubArr() {
        for (int i = 0; i < a.length; i++) {
            int Sum = 0;
            for (int j = i; j < a.length; j++) {
                Sum += a[j];
                if (Sum == sum) {
                    System.out
                            .println(" Index of sub array " + i + "and " + j + "and you sub array");
                    for (int k = i; k <= j; k++) {
                        System.out.print(" " + a[k]);
                    }
                    System.out.println();

                }
            }
        }
    }

    public class Q2 {

        public static void main(String[] args) {
            int arr[] = new int[6];
            System.out.println("Enter the 6 elements in the array: \n");
            Scanner cin = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextInt();

            }

            System.out.println("Enter the sum: \n i will be show the output\n ");
            int sum = cin.nextInt();
            SubArrSum s = new SubArrSum(arr, sum);
            s.findSubArr();
        }

    }
}

// import java.util.Scanner;

// class SubArrSum {
// private int a[];
// private int sum;

// SubArrSum(int a[], int sum) {
// this.a = a;
// this.sum = sum;
// }

// public void findSubArr() {
// for (int i = 0; i < a.length; i++) {
// int currentSum = 0;
// for (int j = i; j < a.length; j++) {
// currentSum += a[j]; // Add the current element to the sum

// // Check if the current sum is equal to the target sum
// if (currentSum == sum) {
// System.out.print("Subarray found between indices " + i + " and " + j + ": ");

// // Print the subarray
// for (int k = i; k <= j; k++) {
// System.out.print(a[k] + " ");
// }
// System.out.println();
// return; // Stop after finding the first matching subarray
// }
// }
// }
// // If no subarray found
// System.out.println("No subarray with the given sum found.");
// }
// }

// public class Q2 {
// public static void main(String[] args) {
// Scanner cin = new Scanner(System.in);

// // Define array size
// int arr[] = new int[6];
// System.out.println("Enter 6 elements in the array:");

// // Input array elements
// for (int i = 0; i < arr.length; i++) {
// arr[i] = cin.nextInt();
// }

// System.out.println("Enter the target sum:");
// int sum = cin.nextInt();

// // Create an instance of SubArrSum and find subarrays
// SubArrSum s = new SubArrSum(arr, sum);
// s.findSubArr();
// }
// }
