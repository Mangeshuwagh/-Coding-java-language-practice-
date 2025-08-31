
import java.text.CollationElementIterator;
import java.util.*;

public class HashMap_Using_Coll {

    public static void main(String[] args) {

        LinkedHashMap lhm = new LinkedHashMap<>();

        lhm.put(1, "Mangesh");
        lhm.put(2, "Vaishani");
        lhm.put(3, "kirti");
        lhm.put(4, "sumesh");
        lhm.put(5, "angle");
        lhm.put(5, "angle");

        // \CollationElementIterator
        Collection cls = lhm.values();

        for (Object obj : cls) {

            System.out.println(obj);
        }
    }

}
