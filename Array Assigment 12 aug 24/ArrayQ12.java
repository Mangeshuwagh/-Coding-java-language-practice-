//12)	 Write a Java program to calculate the largest gap between sorted elements of an array of integers.  
//Example:
//Original array: [23, -2, 45, 38, 12, 4, 6]
//Largest gap between sorted elements of the said array: 15

import java.util.Scanner;

public class ArrayQ12 {

	public static void main(String[] args) {

		int arr[] = new int[7];

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the 7 elemets in the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cin.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		// asencding sort array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Show the output \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		int maxgap = 0;

		for (int i = 1; i < arr.length; i++) {
			int gap = arr[i] = arr[i - 1];
			if (gap > maxgap) {
				maxgap = gap;
			}
		}
		System.out.print(" Maximum gap gap for two Elements in the array " + maxgap);

	}
}