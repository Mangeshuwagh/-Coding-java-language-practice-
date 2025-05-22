
// Q6. Write a program to Create ArrayList and store 5
//  player objects in it and sort the player object by using id 

import java.util.ArrayList;

import java.util.Collections;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

class player implements Comparable<player> {
    private int id;
    private String name;
    private int run;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setplayers(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "player id: " + id + "Player name: " + name + " Player run: " + run;
    }

    @Override
    public int compareTo(player p) {

        if (this.id > p.id) {
            return 1;
        } else if (this.id < id) {
            return -1;

        } else {
            return 0;
        }

    }
}

// @Override
// public int compareTo(Object o) {
// player p = (player) o;
// if (this.id > p.id) {
// return 1;

// } else if (this.id < p.id) {
// return -1;

// } else {
// return 0;
// }
// }

public class SortById {

    public static void main(String[] args) {

        ArrayList<player> pli = new ArrayList<>();

        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 5; i++)

        {
            player p = new player();
            System.out.println("Enter the player id");
            int id = cin.nextInt();
            System.out.println("Enter the player Name");
            cin.nextLine();
            String name = cin.nextLine();
            System.out.println("Enter the player run");
            int run = cin.nextInt();

            p.setplayers(id, name, run);

            pli.add(p);

        }

        System.out.println("show the Players ");
        for (Object pla : pli) {
            player p = (player) pla;
            System.out.println(
                    "Player Id; " + p.getId() + "Player name: " + p.getName() + " player runs: " + p.getName());

            // System.out.println(player);

        }

        Collections.sort(pli);

        System.out.println(" we now sorting by id" + pli);

    }

}
