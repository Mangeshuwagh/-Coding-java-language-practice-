
// WAP to create a stack and store product details in it using the pojo
//  class concept with field id,name and price and 
// prodExpDate and perform the following operation on it.
//  	Case 1: Add New Product 
//             Case 2: View All Products 
//             Case 3: View All Products using expiry date means show the product on top whose expiry date is near 
// 	Case 4: delete product using its expiry date means if your system is greater than expiry data then delete data
import java.util.*;

class Product {
    private int id;
    private double price;
    private String fild, expireDate, PrtName;

    Product(int id, double price, String fild, String expireDate, String PrtName)

    {

        this.id = id;
        this.price = price;
        this.fild = fild;
        this.expireDate = expireDate;
        this.PrtName = PrtName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getFild() {
        return fild;
    }

    public double getPrice() {
        return price;
    }

    public String getPrtName() {
        return PrtName;
    }

    public int getId() {
        return id;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setFild(String fild) {
        this.fild = fild;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrtName(String prtName) {
        PrtName = prtName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Product Id: " + id + " Product Name: " + PrtName + " Product Fild: " + fild + " Product Price: " + price
                + " Product ExpireDate " + expireDate;
    }

}
