
import java.util.*;

public class LinkedHa {

    public static void main(String[] args) {
        LinkedHashMap<String, LinkedHashMap<Integer, String>> Collage = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();

        LinkedHashMap<Integer, String> FistYear = new LinkedHashMap<Integer, String>();

        FistYear.put(1, "mangesh wagh");
        FistYear.put(3, "Umakant wagh");
        FistYear.put(2, "Radhey wagh");
        FistYear.put(5, "Guddi tai wagh");

        LinkedHashMap<Integer, String> SndYear = new LinkedHashMap<>();

        SndYear.put(1, "Mangesh Wagh");
        SndYear.put(4, "Yandnesh Wagh");
        SndYear.put(2, "Kailas Wagh");
        SndYear.put(8, "Hanuman ji ");
        SndYear.put(5, "Bhagwan Ram");

        Collage.put("First Year", FistYear);
        Collage.put("Second Year", SndYear);

        // print the we the all hashMap

        Set<Map.Entry<String, LinkedHashMap<Integer, String>>> fst = Collage.entrySet();

        for (Map.Entry<String, LinkedHashMap<Integer, String>> m : fst) {
            String Year = m.getKey();
            System.out.println("++++++++" + Year + "++++++++++++++++++++");
            LinkedHashMap<Integer, String> inner = m.getValue();

            Set<Map.Entry<Integer, String>> fns = inner.entrySet();
            for (Map.Entry<Integer, String> fds : fns) {

                System.out.println(fds.getKey() + "\t\t" + fds.getValue());
            }
            System.out.println("-------------------------------------");
        }

    }

}