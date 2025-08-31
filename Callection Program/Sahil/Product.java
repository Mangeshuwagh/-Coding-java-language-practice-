public class Product {
    private int field_id, price;
    private String name, expiryDate;

    public Product(int price, int field_id, String name, String expiryDate) {
        this.price = price;
        this.field_id = field_id;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getField_id() {
        return field_id;
    }

    public void setField_id(int field_id) {
        this.field_id = field_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product ID: " + field_id + ", Name: " + name + ", Price: " + price + ", Expiry Date: " + expiryDate;
    }
}
