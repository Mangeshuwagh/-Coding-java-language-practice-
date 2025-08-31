// WAP to create POJO class name as Player with id,name and run and create 
// array of object of Player POJO class with size 5 and store all player pojo in Vector 
// object and arrange all player records by run in descending order

import java.util.*;

public class PojoClass {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        Player[] pr = new Player[5];
        int id, run;
        String name;

        for (int i = 0; i < pr.length; i++) {
            // pr[i] = new Player[];
            System.out.println("Enter the Player Details: " + (i + 1) + " ");
            System.out.print("ID: ");
            id = cin.nextInt();
            cin.nextLine(); // Consume newline
            System.out.print("Name: ");
            name = cin.nextLine();
            System.out.print("Run: ");
            run = cin.nextInt();

            pr[i] = new Player(name, id, run);
        }

        System.out.println("Show the Details : ");
        for (int i = 0; i < pr.length; i++) {
            System.out.println(" Player id: " + pr[i].getId() + "\tname: " + pr[i].getPlname()
                    + "\t run : " + pr[i].getRun());
        }
        for (int i = 0; i < pr.length; i++) {
            for (int j = i + 1; j < pr.length; j++) {
                if (pr[i].getRun() > pr[j].getRun()) {

                    Player p = pr[i];
                    pr[i] = pr[j];
                    pr[j] = p;

                }
            }
        }

        Vector<Player> v = new Vector<>();

        for (int i = 0; i < pr.length; i++) {
            v.add(pr[i]);
        }

        System.out.println("Show the all detailsin the vectors class: ");
        for (int i = 0; i < v.size(); i++) {
            Player player = v.get(i);
            System.out.println("Id: " + player.getId() + " Namme : " + player.getPlname() + " Run " + player.getRun());

        }
    }

}
