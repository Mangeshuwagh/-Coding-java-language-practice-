import java.util.*;

public class Treese {

    public static void main(String[] args) {
        int id, run;
        String name;
        Scanner cin = new Scanner(System.in);
        PlayerRunSort rns = new PlayerRunSort();

        TreeSet ts = new TreeSet<>(rns);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Detaisl: " + (i + 1));
            System.out.println();
            System.out.println("Enter the Player Id: ");
            id = cin.nextInt();
            System.out.println("Enter the Player Name:");
            cin.nextLine();
            name = cin.nextLine();
            System.out.println("Enter the Player Run: ");
            run = cin.nextInt();
            ts.add(new Player(name, id, run));

        }
        for (Object obj : ts) {
            Player p = (Player) obj;
            System.out
                    .println("ID : " + p.getId() + "\t Player Name: \t" + p.getName() + "Player Run: \t" + p.getRun());
        }

        // System.out.println(" " + ts);

        // TreeSet ts = new TreeSet();
        // ts.add(new Player("ABC", 1, 100));
        // ts.add(new Player("MNO", 2, 2500));
        // ts.add(new Player("PQR", 3, 300));
        // ts.add(new Player("STV", 5, 400));
        // ts.add(new Player("XYZ", 4, 600));
        // for (Object obj : ts) {
        // Player p = (Player) obj;
        // System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
        // }

    }

}