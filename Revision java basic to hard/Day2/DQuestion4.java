
// Q3. Write program to create class name as FindMax with two functions  
//     void setArray(int a[]): this function is used for accept array as parameter  
//      int getMax(): this function can find the max value from array and return it.
import java.util.Scanner;

import javax.security.sasl.SaslException;

class FindMax {

    private int a[];

    public void setArray(int a[]) {
        this.a = a;
    }

    public int getMax() {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];

            }

        }
        return max;
    }
}

public class DQuestion4 {

    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Enter the 5 elments in the array: ");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        FindMax f = new FindMax();
        f.setArray(a);
        System.out.println(" find the max value in the array: " + f.getMax());

    }
}
