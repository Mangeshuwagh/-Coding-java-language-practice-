
import java.util.*;

public class basicPractical {

    public static void main(String args[]) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(1);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(3);
        q.add(7);
        q.add(5);
        q.add(9);
        q.add(11);
        q.add(10);

        System.out.println(q);
        System.out.println("Using the Enhance loop");
        for (Object obj : q) {
            System.out.print(" " + obj);

        }
        // after remove the one elements :

        System.out.println("\n After the Removing the any One Elements: ");
        Scanner cin = new Scanner(System.in);
        System.out.println("\n Enter the Nuber you want the remove so insert :\n  ");
        int number = cin.nextInt();
        boolean b = q.remove(number);
        if (b) {
            System.out.print(" emlents is the Remove Succsefully " + number);
            return;

        } else {
            System.out.println(
                    "Elements is not remove so you will be check herre because it not found the in Queue : " + number);
        }

        System.out.println();
        for (Object obj : q) {

            System.out.print(" " + obj);

        }

    }
}