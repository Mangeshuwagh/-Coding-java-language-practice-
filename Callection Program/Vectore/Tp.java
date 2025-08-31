import java.util.Scanner;
import java.util.Vector;

public class Tp {

    public static void main(String[] args) {

        Player pr[] = new Player[5];

        System.out.println("Enter the plauyers Details: ");
        Scanner cin = new Scanner(System.in);
        String name;
        int id, run;

      
        for (int i = 0; i < pr.length; i++) {
            System.out.println("Enter the details for Player " + (i + 1));
            System.out.print("Enter the ID: ");
            id = cin.nextInt();
            cin.nextLine(); // Consume the newline character

            System.out.print("Enter the name: ");
            name = cin.nextLine();

            System.out.print("Enter the runs: ");
            run = cin.nextInt();

            pr[i] = new Player(name, id, run);
        }

        System.out.println("Show the Details: ");
        for (int i = 0; i < pr.length; i++) {

        }

        Vector<Player> v = new Vector<>();

        for (Player player : v) {
            v.add(player);
        }

        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++)

            {

                if (v.get(i).getRun() > v.get(j).getRun()) {

                    Player pp = v.get(i);
                    // v.get(i) =v.get(j);
                    v.set(i, v.get(j));
                    v.set(j, pp);
                }
            }
        }

        for (Player player : v) {
            System.out.println(
                    "Id: " + player.getId() + " name: " + player.getPlname() + " players run: " + player.getRun());

        }
    }

}
