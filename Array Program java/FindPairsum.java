
// 12) . Write a program in C to find a pair with given sum in the array.  
// Expected Output : 
// The given array : 6 8 4 -5 7 9 
// The given sum : 15 
// Pair of elements can make the given sum by the value of index 0 and 5
import java.util.*;

public class FindPairsum {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a[] = { 6, 8, 4, -5, 7, 9 };
        // =new int[5];

        System.out.println("Enter the 5 lemenets In the Array: \n");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 15) {
                    System.out.println(a[i] + "....." + a[j]);
                }
            }
        }

    }
}
