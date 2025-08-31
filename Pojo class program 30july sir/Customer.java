/*Example: WAP to create billing application you have to design the following classes 
Create class name as Product with field id, name and price,qty and mark this class as POJO class.
and create one class name as Shop with two methods 
void setProducts(Customer c,Product …p): this method can accept infinite products 
Customer POJO class with field id,name and address ,contact 
void calBill(): this method can calculate bill  and your bill format like as */

class Customer {

	private int id;
	private String CustName;
	private String Add;
	private int Contact;

	public void CustsetCustName(String CustName) {
		this.CustName = CustName;

	}

	public String getCustName() {
		return CustName;
	}

	public void CustSetId(int id) {
		this.id = id;

	}

	public int CustgetId() {
		return id;
	}

	public void CustsetAdd(String Add) {
		this.Add = Add;

	}

	public String CustgetAdd() {
		return Add;
	}

	public void CustsetCont(int Contact) {
		this.Contact = Contact;

	}

	public int CustgetCont() {
		return Contact;
	}
}