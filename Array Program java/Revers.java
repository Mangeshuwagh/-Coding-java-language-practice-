import java.util.*;

public class Revers {

    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Enter the 5 Elements: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        // losgic Revse:
        int mid = a.length / 2;
        int End = a.length - 1;

        for (int i = 0; i < End; i++) {
            int temp = a[i];
            a[i] = a[End];
            a[End] = temp;
            End--;

        }
        System.out.println("Show the Revers array: \n");

        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}
