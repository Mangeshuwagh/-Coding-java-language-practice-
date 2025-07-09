import java.util.*;
// 2.Accept 10 words from user and store in a Set to remove duplicates. Then convert the set to a list and sort it.

class SortByName implements Comparator<String> {

    public int compare(String st1, String st2) {

        return st1.compareToIgnoreCase(st2);

    }

}

public class program2nd {

    public static void main(String[] args) {

        HashSet<String> Hsl = new HashSet<>();
        Hsl.add("Yogesh");
        Hsl.add("Ramesh");
        Hsl.add("Kaya");
        Hsl.add("Tomya");
        Hsl.add("Aapya");
        Hsl.add("Damrudya");
        Hsl.add("Aapya");
        Hsl.add("Mangesh");
        Hsl.add("Ramesh");

        // ArrayList<String> snm = new ArrayList<>(Hsl);

        List<String> nameli = new ArrayList<String>(Hsl);
        for (String name : nameli) {
            System.out.println("Name Of the Students: " + name);
        }

        // Collections.sort(snm, new SortByName());
        Collections.sort(nameli, new SortByName());
        System.out.println("After the Sorting the Set and we Copied by in the Arraylsiy ");

        for (String name : nameli) {

            System.out.println(name);
        }

    }

}
