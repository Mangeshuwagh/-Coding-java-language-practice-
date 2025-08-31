// 12).WAP to create the class name as Player with a setter and getter method with a Player 
// details. 
// class Player 
// {  private int id; 
//     private String name; 
//     private int runs; 
//     public void setId(int id) 
//     { this.id=id; 
//     } 
//     public int getId() 
//     { return id; 
//     } 
//     public void setName(String name) 
//     { this.name=name; 
//     } 
//    public String getName() 
//    { return name; 
//     } 
//    public void setRuns(int runs) 
//     { this.runs=runs; 
//     } 
//   public int getRuns() 
//     { return runs; 
//    } 
// } 
// Create the one more class name as Team and pass Player objects in Team class using a var-args 
// concept and show the Player details in Team class. 

// Then we need to create the class with a main method and write the code with a following logics  

import java.util.Scanner;

class Player {

    private int id;
    private String name;
    private int runs;

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setPlaName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }
}

class Team {

    Player p;

    void addPlayer(Player... p) {
        System.out.println(" Show the  players Record's");

        System.out.println("Jerusy No.     Player Name     Players Runs");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getId() + "         " + p[i].getName() + "                " + p[i].getRuns());
        }

    }
}

public class Question12 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int id, runs;
        int n = 1;
        String name;
        System.out.println(n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p = new Player();
        p.setId(id);
        p.setPlaName(name);
        p.setRuns(runs);

        // String name;
        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p1 = new Player();
        p1.setId(id);
        p1.setPlaName(name);
        p1.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p2 = new Player();
        p2.setId(id);
        p2.setPlaName(name);
        p2.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p3 = new Player();
        p3.setId(id);
        p3.setPlaName(name);
        p3.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p4 = new Player();
        p4.setId(id);
        p4.setPlaName(name);
        p4.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p5 = new Player();
        p5.setId(id);
        p5.setPlaName(name);
        p5.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p6 = new Player();
        p6.setId(id);
        p6.setPlaName(name);
        p6.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p7 = new Player();
        p7.setId(id);
        p7.setPlaName(name);
        p7.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p8 = new Player();
        p8.setId(id);
        p8.setPlaName(name);
        p8.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p9 = new Player();
        p9.setId(id);
        p9.setPlaName(name);
        p9.setRuns(runs);

        System.out.println(++n + " Enter the player id");
        id = cin.nextInt();
        System.out.println(n + "Enter the player Name; ");
        cin.nextLine();
        name = cin.nextLine();

        System.out.println(n + "Enter the player Runs: ");
        runs = cin.nextInt();
        Player p10 = new Player();
        p10.setId(id);
        p10.setPlaName(name);
        p10.setRuns(runs);
        Team T = new Team();
        T.addPlayer(p, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

    }
}
