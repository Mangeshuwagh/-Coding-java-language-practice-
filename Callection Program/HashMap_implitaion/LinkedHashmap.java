import java.util.*;

public class LinkedHashmap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(1, "Mangesh");
        lhm.put(4, "nangesh");
        lhm.put(2, "oangesh");
        lhm.put(3, "pangesh");
        lhm.put(7, "qangesh");
        lhm.put(10, "rangesh");
        lhm.put(5, "sngesh");

        Set<Map.Entry<Integer, String>> entrySet = lhm.entrySet();
        for (Map.Entry<Integer, String> obj : entrySet)

        {
            System.out.println(obj.getKey() + "\t" + obj.getValue());
        }
    }

}
