
import java.util.*;

public class HashMao1st {

    public static void main(String[] args) {

        LinkedHashMap<String, HashMap<Integer, String>> DEPT = new LinkedHashMap<String, HashMap<Integer, String>>();

        ArrayList FE = new ArrayList<>();
        FE.add(1, "Mangesh");
        FE.add(2, "Sahil");
        FE.add(3, "Smita");

        ArrayList SE = new ArrayList<>();
        SE.add(1, "Renuka");
        SE.add(2, "Renuka");
        SE.add(3, "Renuka");

        DEPT.put("FE", FE);
        DEPT.put("SE", SE);

    }
}
