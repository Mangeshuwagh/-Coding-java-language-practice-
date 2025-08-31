/*
              *
            *   *
          *   *   *
        *   *   *   *
      *   *   *   *   * 
    *   *   *   *   *   *

*/

import java.util.Scanner;

public class Six_Pattern {

    public static void main(String[] args) {
        int row, column;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Row ");

        row = cin.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print("   ");

                }
            }
            System.err.println();
        }
    }
}
