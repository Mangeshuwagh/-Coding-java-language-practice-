
// Write program to create array of size 5 and find max value? 
import java.util.Scanner;

public class Questio11 {

    public static void main(String[] args) {

        int a[] = new int[5];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 elements in the array");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            // a[i]=cin.nextInt();
            System.out.print(" " + a[i]);
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];

            }
        }
        System.out.println(" Max value in the array : " + max);
    }
}
