import java.util.*;

public class PlayerApp {

    public static void main(String[] args) {
        int id, run;
        String Name;
        ArrayList al = new ArrayList<>();
        System.out.println(" enter the size u want : ");
        int size;
        Scanner cin = new Scanner(System.in);
        size = cin.nextInt();
        System.out.println("Enter the details: ");
        for (int i = 0; i < size; i++) {

            System.out.println("enter the Id: ");
            id = cin.nextInt();
            System.out.println("Enter the Player Name: ");
            cin.nextLine();
            Name = cin.nextLine();
            System.out.println("Enter the Player Runs: ");
            run = cin.nextInt();

            al.add(new Player(Name, id, run));
        }
        System.out.println("Show the Details Players: ");
        for (Object obj : al) {
            Player p = (Player) obj;
            System.out.println(" Id : " + p.getId() + "  " + p.getPlayerName() + " " + p.getRun());
        }
        System.out.println("after sorting the player : \n\n");
        Collections.sort(al);
        for (Object object : al) {

            Player p = (Player) object;
            System.out.println(" Id : " + p.getId() + "  " + p.getPlayerName() + " " + p.getRun());

        }
    }
}
