
// 11). Write a program in C to find the second largest element in an array ? 
// Test Data : 
// Input the size of array : 5 
// Input 5 elements in the array : 
// element - 0 : 2 
// element - 1 : 9 
// element - 2 : 1 
// element - 3 : 4 
// element - 4 : 6 
// Expected Output : 
// The Second largest element in the array is : 6 
import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Enter the 5 Elements in the Array : \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        for (int i = 0; i < a.length; i++) {

            // a[i]=cin.nextInt();
            for (int j = i + 1; j < a.length; j++) {
                // a[i]=cin.nextInt();
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
        }
        System.out.println("Show the Second Large Elements: \n" + a[a.length - 2]);
    }
}
