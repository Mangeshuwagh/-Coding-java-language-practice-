
// 9) . Write a program in C to separate odd and even integers in separate arrays ? 
// Test Data : 
// Input the number of elements to be stored in the array :5 
// Input 5 elements in the array : 
// element - 0 : 25 
// element - 1 : 47 
// element - 2 : 42 
// element - 3 : 56 
// element - 4 : 32 
// Expected Output : 
// The Even elements are : 
// 42 56 32 
// The Odd elements are : 
// 25 47
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int a[] = { 25, 47, 42, 56, 32 };

        int Even[] = new int[3];
        int Odd[] = new int[3];
        int E = 0;
        int O = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                Even[E] = a[i];
                E++;

            } else if (a[i] % 2 == 1) {

                Odd[O] = a[i];
                O++;

            }

        }

        System.out.println("Even the numbers : \n");
        for (int i = 0; i < E; i++) {
            System.out.println("\t" + Even[i]);
        }
        System.out.println("Odd the numbers : \n");
        for (int i = 0; i < O; i++) {
            System.out.println("\t" + Odd[i]);
        }
    }
}
