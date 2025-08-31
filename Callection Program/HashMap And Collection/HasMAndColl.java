
// Tourlament program
import java.util.*;

public class HasMAndColl {
    public static void main(String[] args) {
        LinkedHashMap<String, ArrayList<String>> tour = new LinkedHashMap<String, ArrayList<String>>();
        ArrayList<String> india = new ArrayList<String>();

        india.add("Haidik pandya");
        india.add("Rohit Sharma");
        india.add("Virat Kohali");
        india.add("Hrishapant ");
        india.add("Gill");

        ArrayList<String> Aus = new ArrayList<String>();

        Aus.add("Josh Buttler");
        Aus.add("Smith");
        Aus.add("Dickok");
        Aus.add("AB diviler ");
        Aus.add("AB diviler ");

        tour.put("India", india);
        tour.put("Austrilia", Aus);

        Set<Map.Entry<String, ArrayList<String>>> entries = tour.entrySet();
        for (Map.Entry<String, ArrayList<String>> mm : entries) {
            System.out.println(mm.getKey());
            System.out.println("=======================KEY===========================");

            ArrayList<String> al = mm.getValue();

            for (String data : al) {
                System.out.println(data);

            }
            System.out.println("+++++++++++++++++++++++++++++");
        }
    }

}