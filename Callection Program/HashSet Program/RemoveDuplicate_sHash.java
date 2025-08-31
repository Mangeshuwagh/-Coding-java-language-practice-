
import java.util.*;

public class RemoveDuplicate_sHash {

    public static void main(String[] args) {

        ArrayList li = new ArrayList<>();

        li.add(100);
        li.add(300);
        li.add(200);
        li.add(800);
        li.add(900);
        li.add(300);
        System.out.println(" \n sow the array List: \n " + li);// remove the Dulicate using the Hashset:

        HashSet s = new HashSet<>(li);
        System.out.println("\n SHow the All elements in the Store the Hashset:\n ");

        for (Object object : s) {

            System.out.println(object);
        }
    }
}
