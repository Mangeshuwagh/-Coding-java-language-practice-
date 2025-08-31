// 1)	Given an array of integers nums and an integer target,
//  return indices of the two numbers such that they add up to target.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

import java.util.Scanner;

class Array {
    private int arr[];
    private int num;

    public void setArray(int arr[], int num) {
        this.num = num;

        this.arr = arr;
    }

    public int show() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println("[ " + i + "," + j + "]");
                    // break;
                }
            }
        }
        return 0;
    }
}

public class ArrayQ1 {

    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the five elements in the array : \n");
        // for (int i : array) {
        // array[i] = cin.nextInt();
        // }
        for (int i = 0; i < array.length; i++) {
            array[i] = cin.nextInt();
        }
        int num;
        System.out.println("Enter the summ");
        num = cin.nextInt();
        Array a = new Array();
        a.setArray(array, num);
        a.show();

    }
}