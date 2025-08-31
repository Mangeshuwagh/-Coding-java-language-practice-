
// 10.  Write program to create array of size 5 and display its value?
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            // a[i]=cin.nextInt();
            System.out.print(" " + a[i]);
        }

    }

}
