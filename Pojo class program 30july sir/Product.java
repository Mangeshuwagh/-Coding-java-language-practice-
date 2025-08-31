/*Example: WAP to create billing application you have to design the following classes 
Create class name as Product with field id, name and price,qty and mark this class as POJO class.
and create one class name as Shop with two methods 
void setProducts(Customer c,Product …p): this method can accept infinite products 
Customer POJO class with field id,name and address ,contact 
void calBill(): this method can calculate bill  and your bill format like as */

class Product {

	private int id;
	private String name;
	private int Price;
	private int qty;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setProName(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public int getPrice() {

		return Price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}

}