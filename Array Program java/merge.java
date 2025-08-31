import java.util.Scanner;

public class merge {
    public static void main(String[] args) {

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 1st array in the value : \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("Enter the 2st array in the value : \n");
        for (int i = 0; i < a.length; i++) {
            b[i] = cin.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];

        }
        int l = 5;
        for (int j = 0; j < b.length; j++) {

            c[l] = b[j];
            l++;
        }

        System.out.println("Merje the array : \n");
        for (int i = 0; i < c.length; i++) {
            System.out.print(" \t" + c[i]);
        }
    }
}