import java.util.Scanner;

public class Subarr1 {

    public static void main(String[] args) {
        int a[] = { 3, 4, -7, 1, 3, 3, 1, -4 };

        System.out.print("Give the numbers: \n");

        int sum;
        Scanner cin = new Scanner(System.in);

        sum = cin.nextInt();
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println("[" + i + "..." + j + "]--{" + a[i] + "..." + a[j] + "}");
                    for (int k = i; k < j; k++) {
                        // if (a[i] + a[j] + a[k] == sum) {
                        // System.out.println("[" + i + "....." + k + "]--{" + a[i] + "..." + a[j] +
                        // "...."
                        // + a[k] + "}");
                        System.out.print(a[i] + " ");
                    }
                    System.out.println("}");

                }

            }
            // else {
            // for (int k = j + 1; k < a.length; k++) {
            // if (a[i] + a[j] + a[k] == sum) {
            // System.out.println("[" + i + "....." + k + "]--{" + a[i] + "..." + a[j] +
            // "...."
            // + a[k] + "}");
            // break;
            // }
            // }
        }

    }

    // }

}
// }