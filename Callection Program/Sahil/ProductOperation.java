import java.util.*;

class ProductOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Product> stack = new Stack<>();

        while (true) {
            System.out.print(
                    "1-Add new product\n2-View all products\n3-View all products expiry date wise\n4-Delete product using expiry date\n5-Exit\nEnter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = input.nextInt();
                    System.out.print("Enter product price: ");
                    int price = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String name = input.nextLine();
                    System.out.print("Enter expiry date (YYYY-MM-DD): ");
                    String expiryDate = input.nextLine();

                    Product product = new Product(price, id, name, expiryDate);
                    stack.push(product);
                    System.out.println("Product added successfully.\n");
                    break;

                case 2:
                    System.out.println("Viewing all products:");
                    for (Product prod : stack) {
                        System.out.println(prod);
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Viewing products sorted by expiry date:");
                    List<Product> productList = new ArrayList<>(stack);
                    productList.sort(Comparator.comparing(Product::getExpiryDate));
                    for (Product prod : productList) {
                        System.out.println(prod);
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter expiry date to delete products (YYYY-MM-DD): ");
                    String dateToDelete = input.nextLine();

                    deleteProduct(stack, dateToDelete);
                    break;

                case 5:
                    System.out.println("Exit chosen");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    private static void deleteProduct(Stack<Product> stack, String dateToDelete) {
        Iterator<Product> i = stack.iterator();

        while (i.hasNext()) {
            Product obj = i.next();
            if (obj.getExpiryDate().equals(dateToDelete)) {
                i.remove();
            }
        }

    }
}