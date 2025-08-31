
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println(" shoe the arry elments");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);

        }
        System.out.println("\nEnter the vaue find in the arrya ");
        int find = cin.nextInt();
        boolean m = false;
        int index = 0, value = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find) {
                index = i;
                m = true;
                value = a[i];
                break;

            }
        }
        if (m) {
            System.out.println(" \n Sapdamli re bhadvya tula vatle ki nahi ahe as : value:  " + value + "\n and  indeix" + index);
        } else {
            System.out.println("nahi sqapdla mala array madye bhavdya");
        }
    }
}