
// Q3. WAP to create array of integer values and store  10 values in array and
//  find the duplicate element from  array by using HashMap
import java.util.*;

public class ProgramHashMap {

    public static void main(String[] args) {

        int duArry[] = new int[10];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 10 Elements in the Array ");
        for (int i = 0; i < 10; i++) {
            duArry[i] = cin.nextInt();
        }

        HashMap<Integer, Integer> aiInt = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(" show the Duplicates: ");
        for (int elemets : duArry) {
            if (aiInt.containsKey(elemets)) {
                // if (!list.contains(elemets)) {
                // list.add(elemets);
                System.out.print(elemets + " ");
                // }

            } else {
                aiInt.put(elemets, 1);
            }

        }
        // for (int n : list) {
        // System.out.print(" " + n);

        // }

        // for(Map.Entry<Integer,Integer> m: aiInt.entrySet()){

        // }
    }

}