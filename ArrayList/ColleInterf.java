
import java.util.ArrayList;
import java.util.Iterator;

public class ColleInterf {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        // all method we are Apply

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);

        // System.out.println("show the all value in the array List " + al);

        Iterator i = al.iterator();

        System.out.println(" Show the array List inside Elements : ");
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.print(" " + obj);

        }

        al.add(9002);
        al.add("mangesh");
        System.out.println("\n After adding the some elements and String\n ");

        Iterator i1 = al.iterator();
        // System.out.println(" " + al);

        while (i1.hasNext()) {
            Object obj = i1.next();
            System.out.print(" " + obj);

        }

        // add the more than one value in the array List;

        ArrayList al1 = new ArrayList<>();

        al1.add(9000);
        al1.add(2300);
        al1.add(8300);
        al1.add(92300);

        al.addAll(al1);

        System.out.println("Show the  Using the addAll(): collection afte we using Showing the Result: ");

        System.out.println(" " + al);
        // remove in the collection value or etc ;

        boolean f = al.remove("mangesh");
        if (f) {

            System.out.println("Remove the Succefully: ");
        } else {
            System.out.println("Its not removed");
        }

        System.out.println("after  the Remove the String Show the ");
        System.out.println(al);
        // count the Size :

        int length = al.size();
        System.out.println("size of array collenction: " + length);

    }
}
