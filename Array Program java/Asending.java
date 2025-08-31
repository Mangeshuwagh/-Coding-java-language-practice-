import java.util.*;

public class Asending {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the 5 Elements: \n");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
        }
        System.out.println("Show the Asending the Array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

}
