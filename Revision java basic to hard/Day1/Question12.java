
// .  Write program to create array of size and arrange all values in ascending order?
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 Elements in the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println(" show the array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Show the ascending order");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);

        }

    }

}
