// 11).WAP to create the class name as Product with a following properties  
// class Product 
// {  private int id; 
//     private String name; 
//     private int qty; 
//     private int rate; 
//    public void setId(int id) 
//     { this.id=id; 
//     } 
//   public int getId() 
//    { return id; 
//    } 
//    public void setName(String name) 
//    { this.name=name; 
//    } 
//    public String getName() 
//    { return name; 
//    } 
//   //write the setter getter 
// // for qty and rate 
// } 
// Create the another class name as CalculateBill and this class is depend on product but we want to 
// pass more than one product details to CalculateBill class so here we use the var-args concept. 
// So your class look like as  

// Then we need to write the class with a main method look like as  
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int qyt;
    private int rate;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int qyt) {
        this.qyt = qyt;

    }

    public int getQuantity() {
        return qyt;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}

class CalculateBill {
    private int pp[];

    public void calBil(Product... p) {
        int Total_bill = 0;
        System.out.print("Product Id         ProductName        Qty        Rate     TotalBill \n");
        for (int i = 0; i < p.length; i++) {
            int Product_Cost = p[i].getQuantity() * p[i].getRate();
            Total_bill += Product_Cost;
            System.out.println(p[i].getId() + "               " + p[i].getName() + "               "
                    + p[i].getQuantity() + "          " + p[i].getRate() + "        " + Product_Cost);

        }
        System.out.println("__________________________________________________________________");
        System.out.println("                                                           " + Total_bill);

    }
}

public class Question11 {

    public static void main(String[] args) {

        int id, qyt, rate;
        String name;
        System.out.println(" Enter the id: ");
        Scanner cin = new Scanner(System.in);

        id = cin.nextInt();
        System.out.println("Enter the Product name: \n");
        cin.nextLine();
        name = cin.nextLine();
        System.out.println("Enter the product rate");
        rate = cin.nextInt();
        System.out.println("Enter the Quantity: ");
        qyt = cin.nextInt();
        // rate = cin.nextInt();
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setQuantity(qyt);
        p.setRate(rate);
        Product p1 = new Product();
        p1.setId(2);
        p1.setName("Buiskit ");
        p1.setQuantity(4);
        p1.setRate(4);
        Product p2 = new Product();

        p2.setId(3);
        p2.setName("Cake    ");
        p2.setQuantity(9);
        p2.setRate(5);

        Product p3 = new Product();

        p3.setId(4);
        p3.setName("Choclate");
        p3.setQuantity(5);
        p3.setRate(10);

        CalculateBill c = new CalculateBill();
        c.calBil(p, p1, p2, p3);

    }
}
