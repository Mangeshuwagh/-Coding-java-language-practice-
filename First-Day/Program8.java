
// Q8. Write a program to Create LinkedList and store 5 Product class objects in it and delete Product by using id.

import java.sql.Struct;
import java.util.*;

class Product {
    private int pid;
    private String pname;
    private int Price;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setpname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Product Id: " + pid + " Product Name: " + pname + " Product Price: " + Price;
    }

    public Product(int pid, String pname, int Price) {

        this.pid = pid;
        this.pname = pname;
        this.Price = Price;
    }

}

public class Program8 {

    public static void main(String[] args) {

        LinkedList<Product> lk = new LinkedList<>();

        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the 5 Products ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the Product Id: ");
            int id = cin.nextInt();
            System.out.println("Enter the Product Name: ");
            cin.nextLine();
            String pname = cin.nextLine();
            System.out.println("Enter the Product Price ");
            int price = cin.nextInt();

            lk.add(new Product(id, pname, price));
        }

        System.out.println(" Show the All the Products and they Details: ");
        for (Product p : lk) {
            System.out.println(p);
        }
        System.out.println("Enter the Product id we Deleted: ");
        int matchProductId = cin.nextInt();
        Iterator<Product> it = lk.iterator();
        boolean b = false;

        while (it.hasNext()) {
            Product p = it.next();
            if (p.getPid() == matchProductId) {
                it.remove();
                b = true;
                break;

            }

        }

        if (b) {
            System.out.println("Delete the SuccessFully the Product in List ");

        } else {
            System.out.println("Product is Not Found: ");
        }
    }

}
