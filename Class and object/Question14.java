
// 14).WAP to create the class name as MarixMultiplication with a following methods  

import java.util.Scanner;

class MatrixMul {

    int a[][];

    public void AddArray(int a[][]) {
        this.a = a;
    }

    void showMatrix() {

        for (int i = 0; i < a.length; i++) {
            int MUl = 1;
            for (int j = 0; j < a[i].length; j++) {
                MUl *= a[i][j];
                System.out.print(" " + a[i][j]);
            }
            System.out.print("= " + MUl);
            System.out.println();
        }
    }
}

public class Question14 {

    public static void main(String[] args) {
        int a[][] = new int[3][3];

        System.out.println("Enter the 2D array Elements: ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = cin.nextInt();

            }
        }
        MatrixMul M = new MatrixMul();
        M.AddArray(a);
        M.showMatrix();
    }
}
