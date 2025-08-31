/*
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *




*/

import java.util.Scanner;

public class Seven_Pattern {

    public static void main(String[] args) {
        int row;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the numbers");
        row = cin.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (j >= i) {
                    System.out.print("* ");

                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }

}

// import java.util.Scanner;

// public class Seven_Pattern {

// public static void main(String[] args) {
// for (int i = 1; i <= 6; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j <= 6; j++) {
// System.out.print("*");
// }
// System.err.println();
// }
// }
// }