// Synchronization?
// : You can convert your non synchronized collection as
//  synchronized collection using Collections class and for that we have
//   method name as Collections.synchronizedNameOfMap()
//  or synchronizedNameOfCollection() etc

import java.util.*;

public class Sycronization {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        System.out.println("Enter the Array List Values: ");
        // ArrayList arli = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            al.add(cin.nextInt());
        }

        System.out.println(" show the array ");
        for (Object obj : al) {
            System.out.println(" " + obj);
        }
        System.out.println("Sycronization : ");

        List li = Collections.synchronizedList(al);
        System.out.println(" List " + li);
    }

}
