
// 17)  Write a program in C to find the smallest missing element from a sorted array? 
// Expected Output : 
// The given array is : 0 1 3 4 5 6 7 9 
// The missing smallest element is: 2
import java.util.*;

public class SmallestMiss {
    // import java.util.Scanner;

    // public class SmallestMissingElement {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 3, 4, 5, 6, 7, 9 };
        // int[] arr = new int[8];
        // Scanner cin = new Scanner(System.in);
        // System.out.println("Enter the elements: \n");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = cin.nextInt();
        // }

        // Display the given array
        System.out.println("The given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int missingElement = findSmallestMissingElement(arr);

        System.out.println("The missing smallest element is: " + missingElement);
    }

    public static int findSmallestMissingElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the middle element is equal to its index, missing element is in the right
            // half
            if (arr[mid] == mid) {
                left = mid + 1;
            } else {
                // Missing element is in the left half or could be the mid element itself
                right = mid - 1;
            }
        }

        // The smallest missing element is found at index 'left'
        return left;
    }
}

// }
