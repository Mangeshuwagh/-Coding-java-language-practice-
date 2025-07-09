
// 1. Create a Map<Integer, List<String>> where each key is a class
//  (like 1, 2, 3...) and value is a list of student names in that class.

import java.util.*;

public class program1st {

    public static void main(String[] args) {

        HashMap<Integer, List<String>> hsl = new HashMap<>();
        List<String> li = new ArrayList<>();
        li.add(" Mangesh");
        li.add("Bhagyshree");
        li.add("Damini");
        li.add("Bhavana");
        li.add("Harshal");
        List<String> li2 = new ArrayList<>();
        li2.add(" Rahul");
        li2.add(" Sunita");
        li2.add(" Madhuri");
        li2.add(" Sangita");
        List<String> li3 = new ArrayList<>();
        li3.add(" Ajikya");
        li3.add(" meghana");
        li3.add(" Rupesh");
        li3.add("Ranjana");
        hsl.put(1, li);
        hsl.put(2, li2);
        hsl.put(3, li3);

        System.out.println(" Show the All the inside the All elements ");
        // Set<Map.Entry<Integer, List<String>>> shm = hsl.entrySet();
        for (Map.Entry<Integer, List<String>> mm : hsl.entrySet()) {

            int num = mm.getKey();
            System.out.println(" Show the key " + num);
            System.out.println(" Show the Name of Student ");
            // System.out.println(mm.getValue());
            // String name = mm.getValue();
            List<String> lil = mm.getValue();
            System.out.println(" name of Students name: " + lil);

        }

    }
}
