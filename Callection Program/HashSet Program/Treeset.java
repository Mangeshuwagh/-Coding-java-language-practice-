
import java.util.*;

public class Treeset {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet<>();

        ts.add(921);
        ts.add(2);
        ts.add(6);
        ts.add(1);
        ts.add(0);
        ts.add(5);
        ts.add(4);
        System.out.println(" " + ts);// showing tthe acending Order:
        for (Object obj : ts) {
            System.out.println(obj);
        }

    }
}
