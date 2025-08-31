import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        al.add(700);

        Iterator<Integer> i = new Iterator();
        while (i.hasNext()) {

            Object obj = i.next();
            System.out.println(obj);
        }
    }
}