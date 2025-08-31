
//  Decending Order Tree Set
import java.util.*;

public class TreesetDes {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet<>();

        ts.add(392);
        ts.add(192);
        ts.add(492);
        ts.add(292);
        ts.add(792);
        ts.add(8234);

        System.out.println("Defulat arrangements: ");
        for (Object object : ts) {
            System.out.println(" " + object);

        }
        NavigableSet nav = ts.descendingSet();

        System.out.println("Data Arragening Desending order ");
        for (Object obj : nav) {
            System.out.println(" " + obj);
        }

    }
}