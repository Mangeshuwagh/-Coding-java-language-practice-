// 20) Write a program in C to find a subarray with given sum from the given array? 
// Expected Output : 
// The given array is : 3 4 -7 1 3 3 1 -4 
// [0..1] -- { 3 4 } 
// [0..5] -- { 3 4 -7 1 3 3 } 
// [3..5] -- { 1 3 3 } 
// [4..6] -- { 3 3 1 }

// import java.util.*;

// public class SubArray {

//     public static void main(String[] args) {

//         int a[] = { 3, 4, -7, 1, 3, 3, 1, -4 };
//         System.out.println("Enter the Intger: \n");
//         int no;
//         Scanner cin = new Scanner(System.in);

//         no = cin.nextInt();
//         int j;
//         int i;
//         int k;
//         for (i = 0; i < a.length; i++) {
//             for (j = 0; j < a.length; j++) {
//                 if (a[i] + a[j] == no) {
//                     System.out.println("[" + i + "........" + j + "]-----{" + a[i] + "\t" + a[j] + "}");

//                 } else {
//                     for (k = j + 1; k < a.length; k++) {

//                         if (a[i] + a[j] + a[k] == no) {
//                             System.out
//                                     .println("[" + i + "......." + k + "]-----{" + a[i] + "\t" + a[j] + "\t" + a[k]
//                                             + "}");
//                             break;

//                         }

//                     }
//                 }
//             }
//         }
//     }
// }
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        int[] a = { 3, 4, -7, 1, 3, 3, 1, -4 };
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the Integer: ");
        int no = cin.nextInt();

        // Close the scanner
        cin.close();

        // Loop to find subarrays with the sum equal to no
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                // sum += a[j];
                sum=sum+a[j];
                if (sum == no) {
                    System.out.print("[" + i + "........" + j + "]-----{");
                    for (int k = i; k <= j; k++) {
                        System.out.print(a[k] + (k == j ? "" : "\t"));
                    }
                    System.out.println("}");
                }
            }
        }
    }
}
