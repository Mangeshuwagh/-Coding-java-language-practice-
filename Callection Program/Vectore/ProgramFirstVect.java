
// WAP to  create vector and store 10 values in it and find the occurent of element

import java.util.*;

public class ProgramFirstVect {

    public static void main(String[] args) {

        Vector v = new Vector<>();
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the limit you want vector add the value: ");
        int limit = cin.nextInt();
        System.out.println("Enter the Values in the vector class: ");
        for (int i = 0; i < limit; i++) {
            v.add(cin.nextInt());

        }
        System.out.println("Show the Value off the vectors ");

        System.out.println(" " + v);

        for (int i = 0; i < v.size(); i++)

        {
            // Skip marked el

            int count = 1;
            for (int j = i + 1; j < v.size(); j++) {
                Object obj1 = v.get(i);
                Object obj2 = v.get(j);

                if ((int) obj1 == (int) obj2) {
                    count++;
                    v.set(j, -1);

                }
                // if (v.get(i).equals(v.get(j))) {

                // count++;
                // // v.set(j, -1);
                // v.set(j, -1); // Mark as visit

                // }
            }
            if ((int) v.get(i) != -1) {

                System.out.println(v.get(i) + " occurs " + count + " times.");
            }
            // System.out.println(v.get(i) + "...............count: " + count);
        }

    }
}