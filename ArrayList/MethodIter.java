
import java.util.ArrayList;
import java.util.Iterator;

public class MethodIter {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(120);
        al.add(100);
        al.add(190);
        al.add(18230);
        al.add("Mangesh");
        al.add(23.5f);
        al.add(1213.3);
        al.add('M');

        Iterator i = al.iterator();
        while (i.hasNext()) {

            Object obj = i.next();
            System.out.println(" " + obj);
        }

    }
}
