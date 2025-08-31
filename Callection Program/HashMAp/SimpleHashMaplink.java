import java.util.*;

public class SimpleHashMaplink {

    public static void main(String[] args) {

        LinkedHashMap hs = new LinkedHashMap<>();

        hs.put(1, "mangesh");
        hs.put(2, "yogesh");
        hs.put(3, "rajesh");
        hs.put(4, "lokesh");
        hs.put(5, "mahesh");
        hs.put(6, "Sarang");

        // Object data = hs.get(5);
        // if (data != null) {
        // System.out.println("Data found");

        // } else {
        // System.out.println("Data is not found: ");
        // }

        boolean chk = hs.containsKey(3);

        if (chk) {
            System.out.println(" data found");
            System.out.println("Booleasn " + chk);

        } else {
            System.out.println("Data is not Found ");
        }

    }

}
