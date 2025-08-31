
// WAP to create POJO class name as Product with field id,
// name and price and create array of object and store 
// 5 product in vector and find product list whose price is same

import java.util.*;

public class FourthProgram {

    public static void main(String[] args) {

        Product p[] = new Product[5];

        String name, fild;
        int id;
        Scanner cin = new Scanner(System.in);
        double price;

        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter the Players details: " + (i + 1));
            cin.nextLine();
            System.out.println("Enter the Product Name: ");
            name = cin.nextLine();
            System.out.println("Enter the ID ");
            id = cin.nextInt();
            System.out.println("Enter the Fild: ");
            // cin.close();
            cin.nextLine();
            fild = cin.nextLine();
            System.out.println("Enter the price: ");
            price = cin.nextDouble();
            p[i] = new Product(id, price, fild, name);
        }
        System.out.println("Show tehe Details: ");
        for (Product product : p) {
            System.out.println(" Name: " + product.getName() + " Id " + product.getId() + "Price: " + product.getPrice()
                    + " filed " + product.getFild());
        }

        System.out.println("Find the Product List thise price is the Same: ");

        Vector<Product> vv = new Vector<>();

        for (Product pp : p) {
            vv.add(pp);
        }

        boolean found = false;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (vv.get(i).getPrice() == vv.get(j).getPrice()) {

                    System.out.println("Products with the same price:");
                    System.out.println("Product Name: " + vv.get(i).getName() +
                            "\tProduct ID: " + vv.get(i).getId() +
                            "\tProduct Price: " + vv.get(i).getPrice() +
                            "\tProduct Fild: " + vv.get(i).getFild());
                    found = true;
                }
            }
        }
        if (!found) {

            System.out.println("Product is not Found sorry: ");

        }

    }

}

// import java.util.*;

// class Product {
// private int id;
// private String name;
// private double price;

// public Product(int id, String name, double price) {
// this.id = id;
// this.name = name;
// this.price = price;
// }

// // Getters
// public int getId() {
// return id;
// }

// public String getName() {
// return name;
// }

// public double getPrice() {
// return price;
// }
// }

// public class FourthProgram {
// public static void main(String[] args) {
// Product[] products = new Product[5];
// Scanner scanner = new Scanner(System.in);

// // Input product details
// for (int i = 0; i < products.length; i++) {
// System.out.println("Enter details for product " + (i + 1) + ":");
// System.out.print("Enter Product Name: ");
// String name = scanner.nextLine();
// System.out.print("Enter Product ID: ");
// int id = scanner.nextInt();
// System.out.print("Enter Product Price: ");
// double price = scanner.nextDouble();
// scanner.nextLine(); // Consume the leftover newline character

// products[i] = new Product(id, name, price);
// }

// // Store products in a vector
// Vector<Product> productVector = new Vector<>(Arrays.asList(products));

// // Find and display products with the same price
// boolean found = false;
// for (int i = 0; i < productVector.size(); i++) {
// for (int j = i + 1; j < productVector.size(); j++) {
// if (productVector.get(i).getPrice() == productVector.get(j).getPrice()) {
// System.out.println("Product with the same price:");
// System.out.println("Product Name: " + productVector.get(i).getName() +
// "\tProduct ID: " + productVector.get(i).getId() +
// "\tProduct Price: " + productVector.get(i).getPrice());
// found = true;
// }
// }
// }

// if (!found) {
// System.out.println("No products found with the same price.");
// }

// scanner.close();
// }
// }
