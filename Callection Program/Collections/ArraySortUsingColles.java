
// Example: we want to create ArrayList and store 5 values in it and perform sorting on it.

import java.lang.reflect.Array;
import java.util.*;

public class ArraySortUsingColles {
    public static void main(String[] args) {
        ArrayList all = new ArrayList<>();
        System.out.println("Enter the Value in the ArrayList: ");
        System.out.println("Giving the Size  or you want the store the values in the array : ");
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();
        for (int i = 0; i < size; i++) {
            all.add(cin.nextInt());
        }
        System.out.println(" show the array List : ");
        for (Object obj : all) {
            System.out.print(" " + obj);
        }
        // Collections.sort(all);
        Collections.sort(all);

        System.out.println("After Sorting the ArrayList: ");
        for (Object ob : all) {

            System.out.print(" " + ob);
        }
    }

}
