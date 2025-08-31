import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        // using the Collections :

        ar.add(100);
        ar.add(800);
        ar.add(1200);
        ar.add(030);
        ar.add(900);
        ar.add(8200);

        ar.add(3);

        // int max = ar.collections
        Object max = Collections.max(ar);
        Object min = Collections.min(ar);

        System.out.println(" show the Maxx: " + max);
        System.out.println(" show the Min: " + min);

    }
}
