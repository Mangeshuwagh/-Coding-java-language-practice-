
import java.util.Scanner;

public class Unionarray {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        System.out.println("Enter the 1st array in the elments");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("Enter the elments in 2nd array:");
        for (int j = 0; j < b.length; j++) {
            b[j] = cin.nextInt();
        }

        // fint the union;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            c[k] = a[i];
            k++;
        }

        System.out.println("Inter section array: ");
        for (int i = 0; i < b.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length; j++)

            {
                flag = 0;
                if (b[i] == a[j]) {
                    flag = 1;
                    System.out.println(" " + b[i]);
                    break;

                }

            }
            if (flag == 0) {
                c[k++] = b[i];

            }
        }
        System.out.println("Union array");

        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
