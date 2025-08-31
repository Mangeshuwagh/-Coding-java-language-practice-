
import java.util.Scanner;

public class Recution {
    static int i = 1;

    public static void main(String[] args) {

        int a[] = new int[10];
        System.out.println("Enter the 10 elements in the array: \n");

        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = cin.nextInt();

        }
        int n = 6;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {

                System.out.println(" find in the array : value and shhow the index : " + a[i] + "\t\t\t" + i);
                break;
            }
        }

        // int a;
        // System.out.println("Enter the value we print the n time \n ");
        // a = cin.nextInt();
        // Show(a);
        // }

        // public static void Show(int b) {

        // if (b != 0) {
        // System.out.println("Good morning Guys how are you all of you ('_')\t" + i );
        // i = i + 1;
        // Show(b - 1);
        // }

    }

}
