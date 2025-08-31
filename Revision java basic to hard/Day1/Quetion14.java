
// 14.  Write program to create array of size 10 and find occurrence of every element in array?
import java.util.*;

public class Quetion14 {

    public static void main(String[] args) {

        int[] a = new int[10];
        System.out.println("Enter the 10 elemets in the array: ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }

        for (int i = 0; i < a.length; i++) {

            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = -1;
                    count++;
                }
            }
            if (a[i] != -1) {
                System.out.println(a[i] + "..............." + count);

            }
        }
    }
}
