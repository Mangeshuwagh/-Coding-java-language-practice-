
// 15.  Write program to create array of size 5 and reverse it
import java.util.*;

public class Question15 {

    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the 5 elments in the array: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int end = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int start = a[i];
            a[i] = a[end];
            a[end] = start;
            end--;
        }
        System.out.println(" showing the revese the array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
