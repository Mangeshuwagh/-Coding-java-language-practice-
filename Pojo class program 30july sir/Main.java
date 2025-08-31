
// Example: WAP to create billing application you have to design the following classes 
// Create class name as Product with field id, name and price,qty and mark this class as POJO class.
// and create one class name as Shop with two methods 
// void setProducts(Customer c,Product …p): this method can accept infinite products 
// Customer POJO class with field id,name and address ,contact 
// void calBill(): this method can calculate bill  and your bill format like as 
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        // int pid, price, qty;
        // String pname;
        // int Cid, Ccont;
        // String Cname;
        // String CAdd;
        // System.out.println("Enetr the Prodcut id: \n");
        // Scanner cin = new Scanner(System.in);
        // pid = cin.nextInt();

        // System.out.println("Ente rteh Product name: \n");
        // cin.nextLine();
        // pname = cin.nextLine();
        // System.out.println("Eneter the Quantity: \n");
        // qty = cin.nextInt();
        // System.out.println("Enter the Price: \n");
        // price = cin.nextInt();
        // System.out.println("Enter the Customer id: ");
        // Cid = cin.nextInt();
        // System.out.println("Enter the Contact: \n");
        // Ccont = cin.nextInt();
        // cin.nextLine();
        // System.out.println("Enter the Customer name: \n");
        // Cname = cin.nextLine();
        // System.out.println("Enter the Address: \n");
        // CAdd = cin.nextLine();
        // // call the other file
        // Product P = new Product();
        // P.setId(pid);
        // P.setProName(pname);
        // P.setPrice(price);
        // P.setQty(qty);
        // Customer C = new Customer();
        // C.CustSetId(Cid);
        // C.CustsetCustName(Cname);
        // C.CustsetAdd(CAdd);
        // C.CustsetCont(Ccont);
        // Shop s = new Shop();
        // s.setProducts(C, P);
        // s.calBill();
        Product P = new Product();
        P.setId(1);
        P.setProName("Apple");
        P.setPrice(100);
        P.setQty(4);
        Customer C = new Customer();
        C.CustSetId(1);
        C.CustsetCustName("Mangesh");
        C.CustsetAdd("Dahiwad");
        C.CustsetCont(9834);
        Product P1 = new Product();
        P1.setId(2);
        P1.setProName("Pinaple");
        P1.setPrice(30);
        P1.setQty(7);
        Customer C1 = new Customer();
        C1.CustSetId(2);
        C1.CustsetCustName("Poonam");
        C1.CustsetAdd("Chalisgaon");
        C1.CustsetCont(824);
        Product P2 = new Product();
        P2.setId(3);
        P2.setProName("Banana");
        P2.setPrice(50);
        P2.setQty(2);
        Customer C3 = new Customer();
        C3.CustSetId(3);
        C3.CustsetCustName("Shital Patil");
        C3.CustsetAdd("Chalisgaon1");
        C3.CustsetCont(9999);

        Shop s = new Shop();
        s.setProducts(P, P1, P2);
        s.setProducts(C, C1, C3);
        s.calBill();

    }
}
