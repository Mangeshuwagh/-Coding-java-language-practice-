import java.util.*;

public class Key_nd_value {

    public static void main(String[] args) {

        LinkedHashMap map = new LinkedHashMap<>();
        map.put(1, "Mangesh");
        map.put(2, "Rakesh");
        map.put(3, "Rajesh");
        map.put(4, "Yogesh");
        map.put(5, "Ramesh");
        map.put(6, "kalpeh");

        Set<Map.Entry<Integer, String>> em = map.entrySet();

        for (Map.Entry mm : em) {
            System.out.println(mm.getKey() + " \t " + mm.getValue());
        }
    }

}