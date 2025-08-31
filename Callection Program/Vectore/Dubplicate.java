
// WAP to create vector and store 10 values in it and remove the duplicated values from vector?
import java.util.*;

public class Dubplicate {

    public static void main(String[] args) {

        Vector<Integer> v1 = new Vector<>();

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Limit 10 enter : ");
        int limit = cin.nextInt();
        for (int i = 0; i < 10; i++) {
            v1.add(cin.nextInt());
        }
        System.out.println(" Originale Vectors " + v1);
        for (int i = 0; i < v1.size(); i++) {
            for (int j = i + 1; j < v1.size(); j++) {
                // Object obj1 = v1.get(i);
                // Object obj2 = v1.get(j);

                // if ((int) obj1 == (int) obj2) {
                // v1.remove();
                // }

                //
                if (v1.get(i).equals(v1.get(j))) {
                    v1.remove(j);
                    j--; // Adjust index after removal to check the next element
                }
            }
        }
        System.out.println(" " + v1);

    }

}
