// 2. Create class and implement Comparator interface in it:
// Now we want to create Product class with field id,name and price and perform
//  sorting of product by using id as well as by using price 
// Case 1: Sort product by Id
// Case 2: Sort Product By Name

import javax.print.attribute.standard.MediaSize.NA;

class Product implements Camparator {

    private int id, price;
    private String Filds, Name;

    Product() {

    }

    public String getFilds() {
        return Filds;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    Product(String Name, String Filds, int id, int price) {
        this.Filds = Filds;
        this.id = id;
        this.price = price;
        this.Name = Name;
    }

}