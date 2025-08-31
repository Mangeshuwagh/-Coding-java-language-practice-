/*Example: WAP to create billing application you have to design the following classes 
Create class name as Product with field id, name and price,qty and mark this class as POJO class.
and create one class name as Shop with two methods 
void setProducts(Customer c,Product …p): this method can accept infinite products 
Customer POJO class with field id,name and address ,contact 
void calBill(): this method can calculate bill  and your bill format like as */
class Shop {

	Product prd[];
	Customer cust[];
	private int Totalbill;
	int Bill;

	public void setProducts(Product... p) {

		prd = p;

	}

	public void setProducts(Customer... C) {
		cust = C;
	}

	void calBill() {
		for (int i = 0; i < cust.length; i++) {

			System.out.print("Customer Details \n");
			System.out.print(".......................................................\n");

			System.out.print(
					"Customer Name: " + cust[i].getCustName() + "\5t id: " + cust[i].CustgetId() + "\t    Address: "
							+ cust[i].CustgetAdd() + "          COnntact:   " + cust[i].CustgetCont() + "\n");
			System.out.println("\n Other Details: \n");
			System.out.print(".......................................................\n");
			// }
			System.out.print(
					"Product id:            Product name:     ProductPrice          Quality:          Total Bill:\n ");
			// for (int i = 0; i < prd.length; i++) {
			Totalbill = prd[i].getQty() * prd[i].getPrice();
			Bill = Bill + Totalbill;
			System.out.println(prd[i].getId() + "                     " + prd[i].getName() + "                    "
					+ prd[i].getPrice() + "              " + prd[i].getQty()
					+ "                " + Totalbill);
			// }
		}
		System.out.println(".......................................................");
		System.out.println("                                                  " + Bill);

	}

}