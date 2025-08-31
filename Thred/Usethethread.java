
import java.util.*;
// 1. WAP to create thread using Thread class and display value from 1 to 10 with delay 10000
// mili seconds?

import java.lang.*;

class Table extends Thread {

    private int num;

    public void setNumber(int num) {
        this.num = num;
    }

    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(" " + num * i);
                Thread.sleep(10000);
            }

        } catch (Exception ex) {
            System.out
                    .println("Show the Eeror " + ex);
        }
    }

}

public class Usethethread {

    public static void main(String[] args)

    {

        Table t = new Table();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the NUmebr we want the show the number of table in min sec ");
        int num = cin.nextInt();

        t.setNumber(num);
        t.start();
    }
}
