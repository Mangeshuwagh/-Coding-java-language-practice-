
import java.util.Comparator;

// import javax.management.ObjectName;

public class PlayerRunSort implements Comparator {
    public int compare(Object o, Object o1) {
        Player p = (Player) o;
        Player p1 = (Player) o1;

        if (p.getRun() > p1.getRun()) {
            return 1;

        } else if (p.getRun() < p1.getRun()) {
            return -1;
        } else {
            return 0;
        }
    }

}

// import java.util.Comparator;
// public class SortPlayerByRun implements Comparator {
// @Override
// public int compare(Object o1, Object o2) {
// Player p1 = (Player) o1;
// Player p2 = (Player) o2;
// return (p1.getRun() > p2.getRun()) ? 1: (p1.getRun() < p2.getRun())?-1:0;
// }
// }
