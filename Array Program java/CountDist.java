// public 26) Write a program in C to count all distinct pairs for a specific difference 
// Expected Output: 
// The given array is: 
// 5 2 3 7 6 4 9 8 
// The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4] 
// // Number of distinct pairs for difference 5 are: 3  {

// }
import java.util.*;

public class CountDist {

    public static void main(String[] args) {

        int a[] = new int[8];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 8 elments in the array : \n");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        // logic lav

        System.out.println("Enter the number we choice in the array how many numbers differents: \n");
        int no;
        int count = 0;
        no = cin.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] - a[i] == no || a[i] - a[j] == no) {
                    System.out.print("[" + a[j] + "," + a[i] + "]\t");
                    count++;

                }
            }
        }
        System.out.println("Number of distinct pairs for difference " + no + " are " + count);
    }
}