// Example: WAP to create class name as id,name and run and sort player data by using run.
// package org.techhub.prodcrud;

// import java.Camparator;
// import java.util.Camparable;

public class Player implements Comparable {

    private int id, run;
    private String PlayerName;

    Player() {

    }

    Player(String PlayerName, int id, int run) {
        this.id = id;
        this.PlayerName = PlayerName;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public int getRun() {
        return run;
    }

    public int compareTo(Object o) {
        Player p1 = (Player) o;
        if (this.getRun() > p1.getRun()) {
            return 1;
        } else if (this.getRun() < p1.getRun()) {

            return -1;
        } else {
            return 0;
        }
    }

    // @Override
    // public int compareTo(Object o) {
    // Player p1=(Player)o;
    // if(this.run>p1.getRun()) {
    // return 1;
    // }
    // else if(this.run<p1.getRun()) {
    // return -1;
    // }
    // else {
    // return 0;
    // }

    // }
}