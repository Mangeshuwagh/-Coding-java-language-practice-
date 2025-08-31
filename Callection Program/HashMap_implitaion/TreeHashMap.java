
import java.util.*;

public class TreeHashMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> TrM = new TreeMap<Integer, String>();

        TrM.put(1, "Mangesh");
        TrM.put(3, "nangesh");
        TrM.put(5, "kangesh");
        TrM.put(2, "aangesh");
        TrM.put(4, "dangesh");
        TrM.put(6, "oangesh");

        Set<Map.Entry<Integer, String>> rmd = TrM.entrySet();

        for (Map.Entry<Integer, String> entry : rmd) {

            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

}
