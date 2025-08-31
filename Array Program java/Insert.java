// 4) WAP to insert the element on specified position in array  ? 
// e.g. declare the array of size 6 and store 5 values in it  and last block should be empty 
//      a[0]                         a[1]                     a[2]                   a[3]                       a[4]                      a[5] 
// 10 20 30 40 50  
// Enter the index on which value want to be insert  
// e.g.    index    = 2  
// Enter the value which want to store on index  
// Value =  100 
// When we insert the value on index then we need to shift the values from index to next index 
// e.g. 
//  a[0]                         a[1]                    a[2]                       a[3]                 a[4] 
// 5 9 11 4 6 

import java.util.*;

public class Insert {
    public static void main(String[] args) {
        int a[] = new int[6];
        Scanner cin = new Scanner(System.in);

        System.out.println(" Enter the 5 Elemets in the array: \n");

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = cin.nextInt();
        }
        int index, Value;

        System.out.println("Enter the Index\n");
        index = cin.nextInt();
        System.out.println("Enter the Value: \n");
        Value = cin.nextInt();

        if (index > 0 && index < 6) {
            for (int i = a.length - 1; i > index; i--) {

                a[i] = a[i - 1];
            }

        } else {
            System.out.println("You Enter the Wrong the Index: \n");
        }
        a[index] = Value;
        System.out.println("Show the Insert the Value in the Array: \n");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

}
