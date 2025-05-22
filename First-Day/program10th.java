// public Q10. Write a program to show the implementation of DQueue?

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class program10th {

    public static void main(String[] args) {
        Deque<Integer> qu = new ArrayDeque();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 10 value in the Deque");
        for (int i = 0; i < 10; i++) {
            int value = cin.nextInt();
            qu.add(value);

        }

        System.out.println("Show the Values ");

        Iterator<Integer> i = qu.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + " ");

        }
        System.out.println("Desending Order Show the Deque");
        Iterator<Integer> ii = qu.descendingIterator();
        while (ii.hasNext()) {
            System.out.print(" " + ii.next());

        }
    }

}