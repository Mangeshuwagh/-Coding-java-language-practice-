// 3. WAP to print the current working thread name and its priority?

import java.util.*;

public class Program3rd {

    public static void main(String[] args) {

        // Thread t = new Thread().currentThread();
        Thread t = Thread.currentThread();
        // t.setName(" Mangesh");

        String priorityNamr = t.getName();

        System.out.println(" Priority name: " + priorityNamr);
        // System.out.println(priorityNamr);
        int value = t.getPriority();
        System.out.println(" Check the priority value: " + value);

    }
}