import java.Camparator;

public class SortByPrice implements Camparator {

    public int campare(Object o1, Object o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;

        if (p1.getPrice() > p2.getPrice()) {
            return 1;

        } else if (p1.getPrice() < p2.getPrice()) {

            return -1;
        } else {
            return 0;
        }

    }

}
