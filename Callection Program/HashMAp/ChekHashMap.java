
import java.util.*;

public class ChekHashMap {
    public static void main(String[] args) {

        LinkedHashMap lhs = new LinkedHashMap<>();

        lhs.put(1, "Mangesh");
        lhs.put(2, "rakesh");
        lhs.put(3, "manoj");
        lhs.put(4, "shashtri");
        lhs.put(5, "camera");
        Set m = lhs.keySet();

        for (Object object : m) {
            Object value = lhs.get(object);
            System.out.println(value);
        }
    }

}
