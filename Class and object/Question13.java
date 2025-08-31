
// 13).WAP to create the class name as PrintMatrix with a two methods void acceptTwoDArray(int 
// x[][]) and    showMatrix() sample code given below  
// class PrintMatrix 
// {  int a[][]; 
//     void acceptTwoDArray(int x[ ][ ]) 
//     { //here we store the two dimensional array in instance variable declared as two d in class e.g a 
//       a=x; 
//     } 
//   void showMatrix() 
//    { //here we can display the matrix logics 
//    } 
// } 
// public class PrintMatrixApp 
// { 
//     public static void main(String x[]) 
//     { //here we need to declare the two dimensional array with a 3 x 3 and store all values in it using a 
// Scanner class 
//       //create the object of PrintMatrix class and call the acceptTwoDArray() function and pass two d 
// matrix in it 
//      //call the showMatrix() function for display the matrix.} 
// }
import java.util.Scanner;

class PrintMatrix {

    private int a[][];

    void acceptTwoDArray(int a[][]) {
        this.a = a;
    }

    void showMatrix() {
        System.out.println("Show thr Matrix Form: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                // a[i][j] = cin.nextInt();
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}

public class Question13 {

    public static void main(String[] args) {

        int a[][] = new int[3][3];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = cin.nextInt();
            }
        }
        PrintMatrix P = new PrintMatrix();
        P.acceptTwoDArray(a);
        P.showMatrix();
    }
}
