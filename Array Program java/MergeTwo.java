
import java.util.*;

public class MergeTwo {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];

        System.out.println("Enter the 1st array: \n");

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Enter the 2nd array: \n");
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            b[i] = cin.nextInt();
            c[i] = a[i];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            c[k] = b[i];
            k++;

        }
        for (int i = 0; i < c.length; i++) {
            // a[i]=cin.nextInt();
            for (int j = i + 1; j < c.length; j++) {
                // a[i]=cin.nextInt();
                if (c[i] < c[j]) {

                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;

                }

            }

        }

        System.out.println("Merge the two  array and show thise array asending \n");
        for (int i = 0; i < c.length; i++) {
            // a[i]=cin.nextInt();
            System.out.print("\t" + c[i]);

        }
    }

}