
// 14) Write a program in C to rotate an array by N positions ? 
// Expected Output : 
// The given array is : 0 3 6 9 12 14 18 20 22 25 27 
// From 4th position the values of the array are : 12 14 18 20 22 25 27 
// Before 4th position the values of the array are : 0 3 6 9 
// After rotating from 4th position the array is: 
// 12 14 18 20 22 25 27 0 3 6 9
import java.util.Scanner;

public class ChangePosition {
    public static void main(String[] args) {
        int a[] = { 0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27 };
        System.out.println("Enter the Index there are change the position Elements: \n");

        int index;
        Scanner cin = new Scanner(System.in);
        System.out.println("Show the Array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Enter the Index you want Change : \n");
        index = cin.nextInt();
        int first;
        // int End=a.length-1;
        int j;
        for (int i = 0; i < index; i++) {
            first = a[0];
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = first;
        }

        System.out.println("Show the Element Change the position: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

}
