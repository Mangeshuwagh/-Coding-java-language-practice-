import java.util.*;

import java.util.Comparator;

public class Product {

    private int id;
    private String Fild, Name;
    private double price;

    Product() {

    }

    Product(String Name, String Fild, int id, double price) {
        this.id = id;
        this.Fild = Fild;
        this.Name = Name;
        this.price = price;

    }

    public String getFild() {
        return Fild;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

}