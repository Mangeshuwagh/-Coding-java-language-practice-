
// 18)  Write a program in C to to print next greater elements in a given unsorted array. Elements for 
// which no greater element exist, consider next greater element as -1. 
// Expected Output : 
// The given array is : 5 3 10 9 6 13 
// Next Bigger Elements are: 
// Next bigger element of 5 in the array is: 10 
// Next bigger element of 3 in the array is: 10 
// Next bigger element of 10 in the array is: 13 
// Next bigger element of 9 in the array is: 13 
// Next bigger element of 6 in the array is: 13 
// Next bigger element of 13 in the array is: -1 
// Next Bigger Elements Array: 
// 10 10 13 13 13 -1 
import java.util.*;

public class GreterElemPosition {
    public static void main(String[] args) {

        int arr[] = { 5, 3, 10, 9, 6, 13 };

        Scanner cin = new Scanner(System.in);
        System.out.println("\n Show the Array : \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    break;
                }
                // } else i(arr[i] == arr[j]) {

                // arr[j] = -1;
                // }
            }
        }
        arr[arr.length - 1] = -1;
        System.out.println("\n Show the Array : \n");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(" " + arr[i]);
        }
    }

}
