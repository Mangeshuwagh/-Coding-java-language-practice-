import java.util.*;

public class HashMapCollection2 {

    public static void main(String[] args) {

        LinkedHashMap<String, LinkedHashMap<Integer, String>> department = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();

        LinkedHashMap<Integer, String> fe = new LinkedHashMap<Integer, String>();

        fe.put(1, "Mangesh");
        fe.put(3, "M");
        fe.put(2, "Mash");
        fe.put(6, "Mesh");
        fe.put(5, "Mngesh");
        fe.put(4, "Mangeh");
        fe.put(7, "Manh");

        LinkedHashMap<Integer, String> se = new LinkedHashMap<Integer, String>();

        se.put(1, "MAngeshja ");
        se.put(3, "Somesh dada");
        se.put(2, "Somesh dada");
        se.put(8, "Somesh dada");
        se.put(9, "Somesh dada");
        se.put(32, "Somesh dada");

        department.put("Fist Year", fe);
        department.put("Second Year", se);

        Set<Map.Entry<String, LinkedHashMap<Integer, String>>> show = department.entrySet();

        for (Map.Entry<String, LinkedHashMap<Integer, String>> m : show) {
            String classroom = m.getKey();

            System.out.println("ClasssRoom: \t " + classroom);
            System.out.println("=====================================");

            LinkedHashMap<Integer, String> l = m.getValue();

            Set<Map.Entry<Integer, String>> studDetials = l.entrySet();
            for (Map.Entry<Integer, String> mans : studDetials) {
                Integer nu = mans.getKey();
                System.out.println(nu + " \t" + mans.getValue());

            }
            System.out.println("-----------------------------------");

        }

    }

}