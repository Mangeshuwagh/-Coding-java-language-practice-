// public
//  28)Write a program in C to print all possible combinations of r elements in a given array. 
// Expected Output: 
// The given array is: 
// 1 5 4 6 8 The combination from by the number of elements are: 4 
// The combinations are: 
// 1 5 4 6 
// 1 5 4 8 
// 1 5 6 8 
// 1 4 6 8 
// 5 4 6 8  {

// }
import java.util.Scanner;

// public class Combination28 {

//     public static void main(String[] args) {
//         int a[] = { 1, 5, 4, 6, 8 };
//         System.out.println("Combine the array: \n");
//         System.out.println("Enter the line: \n");
//         Scanner cin = new Scanner(System.in);
//         int line = cin.nextInt();
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]);
//         }
//         System.out.println();
//         for (int i = 0; i < a.length; i++) {

//             for (int j = 0; j < line; j++) {

//              System.out.print(" "+a[j]);
//             }
//             System.out.println();
//         }

//         }
//         // System.out.print("\n");
//     }

// // }
// import java.util.Scanner;

public class Combination28 {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 6, 8};
        int n = array.length;

        System.out.println("The given array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Enter the number of elements in each combination: ");
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();

        System.out.println("The combinations are: ");

        // Loop through all possible combinations
        for (int i = 0; i < n; i++) {
            if (r == 1) {
                System.out.println(array[i]);
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (r == 2) {
                    System.out.println(array[i] + " " + array[j]);
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (r == 3) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        continue;
                    }
                    for (int l = k + 1; l < n; l++) {
                        if (r == 4) {
                            System.out.println(array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
                            continue;
                        }
                        for (int m = l + 1; m < n; m++) {
                            if (r == 5) {
                                System.out.println(array[i] + " " + array[j] + " " + array[k] + " " + array[l] + " " + array[m]);
                                continue;
                            }
                        }
                    }
                }
            }
        }

        cin.close();
    }
}
