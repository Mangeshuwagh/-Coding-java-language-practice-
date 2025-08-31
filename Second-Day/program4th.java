
// Q4.WAP to create array of integer values and store  10 values in array and remove the 
// duplicate values from  array by using HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class program4th {

    public static void main(String[] args) {
        int arrayys[] = new int[10];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Elements in the Array : ");
        for (int i = 0; i < arrayys.length; i++) {
            arrayys[i] = cin.nextInt();

        }

        HashMap<Integer, Boolean> hsm = new HashMap<>();
        System.out.println(" Show the All Elemets : ");
        for (int elll : arrayys) {

            System.out.print(" " + elll);
        }
        System.out.println();
        System.out.println();
        for (int el : arrayys) {

            if (!hsm.containsKey(el)) {
                hsm.put(el, true);

            }

        }
        Set<Map.Entry<Integer, Boolean>> stms = hsm.entrySet();
        System.out.println(" show the after the removing the Duplicates ");
        for (Map.Entry<Integer, Boolean> mm : stms) {

            System.out.println("key: " + mm.getKey());

        }

    }

}
