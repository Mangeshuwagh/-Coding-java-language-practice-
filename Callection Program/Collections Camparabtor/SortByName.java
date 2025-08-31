
// import java.util.Comparator;
// import java.util.Camparator;
import java.util.Comparator;

public class SortByName implements Comparator<Product> {

    public int compare(Product p1, Product p2)

    {

        return p1.getName().compareTo(p2.getName());
    }

}
