// WAP to create a stack and store product details in it using the pojo
//  class concept with field id,name and price and 
// prodExpDate and perform the following operation on it.
//  	Case 1: Add New Product 
//             Case 2: View All Products 
//             Case 3: View All Products using expiry date means show the product on top whose expiry date is near 
// 	Case 4: delete product using its expiry date means if your system is greater than expiry data then delete data

import java.util.*;

public class StackMain {

    public static void main(String[] args) {
        Stack<Product> st = new Stack<>();

        Scanner cin = new Scanner(System.in);
        char ope;
        do {

            System.out.println(
                    "1-Add new product\n2-View all products\n3-View all products expiry date wise\n4-Delete product using expiry date\n5-Exit\n ");
            System.out.println("Enter  the Your choice:: ");

            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Product Id: ");

                    int id = cin.nextInt();
                    System.out.println("Enter the Product Name: ");
                    cin.nextLine();
                    String name = cin.nextLine();
                    System.out.println("Enter the Product price: ");
                    double price = cin.nextDouble();
                    System.out.println("Enter the Product Fild:(categeory)\n");
                    cin.next();

                    String fild = cin.nextLine();
                    System.out.println("Enter the ExpireDate: (yyyy-mm-dd)");
                    String date = cin.nextLine();
                    Product prd = new Product(id, price, fild, date, name);

                    //
                    st.push(prd);
                    System.out.println("Details Store the Successfully: ");

                    // st.add(new Product(id, price, fild, fild, name));

                    break;
                case 2:
                    System.out.println("Show the All details: ");
                    boolean check = st.empty();
                    if (check) {

                        System.out.println("Stack is empyt:\n ");
                    } else {
                        // System.out.println("");
                        for (Product product : st) {
                            System.out.println(product);
                        }
                    }
                    // for (Product product : st) {
                    // System.out.println(product);

                    // }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Show the Deatils its cooming soon expireDate Close: ");
                    List<Product> productsList = new ArrayList<>(st);
                    productsList.sort(Comparator.comparing(Product::getExpireDate));
                    for (Product product : productsList) {

                        System.out.println(product);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the Expired Date we delete in the Data: eg.(yyyy-mm-dd) \n ");
                    cin.nextLine();
                    String userDate = cin.nextLine();
                    deleteProduct(st, userDate);
                    // System.out.println(" del");

                    break;
                case 5:
                    System.out.println(" Exits the Program : \n");
                    cin.close();

                    // bre ak;
                    return;
                default:
                    System.out.println(" you choice the wrong the opetion : ");
                    break;
            }

        } while (true);

    }

    public static void deleteProduct(Stack<Product> st, String userExpirDate) {
        Iterator<Product> i = st.iterator();
        while (i.hasNext()) {
            Product p = i.next();
            if (p.getExpireDate().equals(userExpirDate)) {

                i.remove();
            }

        }
        System.out.println("Delete Succefull Product: ");
    }

}
