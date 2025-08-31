import java.util.*;

public class Mangesh {
    // import java.util.*;
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "MAngesh");
        hm.put(4, "MAngesh");
        hm.put(24, "MAngesh");
        hm.put(91, "MAngesh");
        hm.put(5, "MAngesh");
        hm.put(2, "MAngesh");
        hm.put(3, "MAngesh");

        Set<Map.Entry<Integer, String>> enterSet = hm.entrySet();

        for (Map.Entry<Integer, String> m : enterSet) {
            System.out.println(" " + m.getKey() + " " + m.getValue());
        }
    }

}
