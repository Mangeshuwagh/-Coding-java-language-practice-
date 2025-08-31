/*11)  Write a Java program to replace each element of the array with the product of every other element in a given array of integers.  
//Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]
Input :
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]*/

import java.util.Scanner;

public class ArrayQ11 {

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int nums2[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int result = 1;
		int result1 = 1;
		for (int i = 1; i < nums1.length; i++) {
			result *= nums1[i];
			
		}
		for (int i = 0; i < nums1.length; i++) {

			nums1[i] = result / nums1[i];
			for (int j = 0; j < nums2.length; j++) {
				if (i != j)

				{
					nums2[i] = result1 / nums2[j];
				}
			}
		}
		System.out.print("Show the same output: \n");
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(" " + nums1[i]);
		}
		System.out.println();
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(" " + nums2[i]);

		}
	}
}
// import java.util.Scanner;

// public class ArrayQ11 {

// public static void main(String[] args) {
// int nums1[] = { 1, 2, 3, 4, 5, 6, 7 };

// long result;
// for (int i = 0; i < nums1.length; i++) {
// result = 1;
// for (int j = 0; j < nums1.length; j++) {
// if (i != j) {
// result *= nums1[j];
// }
// }
// nums1[i] = (int) result;
// // System.out.print(" " + result);
// }
// System.out.print("Show the same output: \n");
// for (int i = 0; i < nums1.length; i++) {
// System.out.print(" " + nums1[i]);
// }
// }
// }
