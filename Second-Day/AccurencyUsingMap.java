// Q2. WAP to create array of integer values and store  10 values in array
//  and find the occurrence of every element in array by using HashMap

import java.util.*;

public class AccurencyUsingMap {

    public static void main(String[] args) {

        HashMap<Integer, Integer> Aint = new HashMap<Integer, Integer>();
        Scanner cin = new Scanner(System.in);
        int arry[] = new int[10];
        System.out.println(" Enter the 10 elements in the Ocurency:");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = cin.nextInt();
        }

        System.out.println("Show the Arrya Elements ");
        for (int ar : arry) {
            System.out.print(ar + " ");
        }

        // adding the elements in the hashMap :

        for (int num : arry) {

            if (Aint.containsKey(num)) {// its a Check the the Key is alredy its present or not, its present

                Aint.put(num, Aint.get(num) + 1);// its add the Same key add the new +1 value means its Counts

            } else {
                Aint.put(num, 1);// its not presnet so add the Key with one value s
            }
        }

        System.out.println(" Show the All Occureny in the Map ");
        System.out.println(" Elements :         : Occurency ");
        for (Map.Entry<Integer, Integer> oc : Aint.entrySet()) {

            System.out.println(oc.getKey() + "\t\t" + oc.getValue());

        }

    }

}
