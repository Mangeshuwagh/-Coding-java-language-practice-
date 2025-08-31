
// 23) Write a program in C to move all zeroes to the end of a given array. 
// Expected Output : 
// The given array is : 2 5 7 0 4 0 7 -5 8 0 
// The new array is: 
// 2 5 7 8 4 -5 7 0 0 0
import java.util.Scanner;

public class Movezerolast {

    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the 10 Elements in the array: \n");
        // 2 5 7 0 4 0 7 -5 8 0
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        // logic start

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 0) {
                int zero = a[i];

                for (int j = i; j < a.length - 1; j++) {

                    a[j] = a[j + 1];
                }
                a[a.length - 1] = zero;

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}