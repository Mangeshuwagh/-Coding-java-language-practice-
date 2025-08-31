import java.util.Vector;

public class FindMaxNumber {

    public static void main(String[] args) {

        Vector v = new Vector<>();

        v.add(100);
        v.add(500);
        v.add(900);
        v.add(2300);
        v.add(50);
        v.add(92300);
        v.add(2400);
        int max = (int) v.get(0);

        for (Object obj : v) {
            if (max < (int) obj) {
                max = (int) obj;
            }
        }
        System.out.println("Show the Maxx: " + max);
    }
}
