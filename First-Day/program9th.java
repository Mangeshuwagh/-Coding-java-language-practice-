
// Q9. Write a program store 10 values in PriorityQueue and explain how they are stored internally?

import java.util.PriorityQueue;
import java.util.Scanner;

public class program9th {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 10th Value in the PriorityQueue ");
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            int value = cin.nextInt();
            p.add(value);

        }

        System.out.println(" Show the Priorty Queue Elements: ");
        System.out.println(p);
        int val = -1;
        for (int i = 1; i <= 10; i++) {
            // System.out.println(p);
            val = p.poll();
        }
        System.out.println("Lagerst Values: " + val);
    }

}