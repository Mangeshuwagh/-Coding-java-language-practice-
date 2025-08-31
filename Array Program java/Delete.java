
// 10). Write a program in C to delete an element at desired position from an array.  
// Test Data : 
// Input the size of array : 5 
// Input 5 elements in the array in ascending order: 
// element - 0 : 1 
// element - 1 : 2 
// element - 2 : 3 
// element - 3 : 4 
// element - 4 : 5 
// Input the position where to delete: 3 
// Expected Output : 
// The new list is : 1 2 4 5
import java.util.*;

public class Delete {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Enter the Asending Elements in Array\n");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        int index;
        System.out.println("Enter the  Index you Want Delete: \n");
        index = cin.nextInt();
        for (int i = index - 1; i < a.length - 1; i++) {
            a[i] = a[i + 1];

        }
        a[a.length - 1] = 0;
        System.out.println("Show the Delet Array: \n");
        for (int i = 0; i < a.length; i++) {
            // a[i]=a[i++];
            System.out.print("\t " + a[i]);

        }
    }
}
