// public class tpp {

// }

// class Rose {
//     public void sam() {
//         int y[] = { 4, 2, 8 };
//         for (int x = 2; x < 1 + 3 * 2 - 4; x++) {
//             System.out.print(x + " ");
//             for (int j : y) {
//                 j = j * x - 4;
//                 System.out.print(j + " ");
//             }
//         }
//     }

//     class tpp {
//         public static void main(String[] args) {
//             Rose r = new Rose();
//             r.sam();
//         }
//     }
// }
import java.util.Scanner;

public class MatrixApplicatio {
     public static void main(String x[]) {

          Scanner xyz = new Scanner(System.in);
          int a[][] = new int[3][];
          a[0] = new int[3];
          a[1] = new int[4];
          a[2] = new int[2];
          System.out.println("Enter the values in matrix");
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = xyz.nextInt();
               }
          }
          System.out.println("display the matrix");
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a[i].length; j++) {
                    System.out.printf("%d\t", a[i][j]);
               }
               System.out.printf("\n");
          }
     }
}