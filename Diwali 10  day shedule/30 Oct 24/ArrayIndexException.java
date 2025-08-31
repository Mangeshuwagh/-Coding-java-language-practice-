
// Q2. ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class ArrayIndexException {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter the 5 elemets in the Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }

        a[10] = 1;

    }

}
