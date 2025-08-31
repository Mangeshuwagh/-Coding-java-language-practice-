
public class Product {

    private int id;
    private double price;
    private String fild, Name;

    public Product(int id, double price, String fild, String Name) {
        this.id = id;
        this.price = price;
        this.fild = fild;
        this.Name = Name;

    }

    public double getPrice() {
        return price;
    }

    public String getFild() {
        return fild;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
    
}
