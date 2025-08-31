import java.util.*;

public class Shop {

    public static void main(String[] args) {
        int id;
        double price;
        String Name;
        String Fild;
        Scanner cin = new Scanner(System.in);
        ArrayList<Product> al = new ArrayList<>();
        System.out.println(" Enter the Details: ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the Product Id: " + (i + 1) + " \n");
            id = cin.nextInt();
            System.out.println("Enter the Product Name: \n");
            cin.nextLine();
            Name = cin.nextLine();
            System.out.println("Enter the Product Fild: \n");
            Fild = cin.nextLine();
            System.out.println("Enter the Price: \n");
            price = cin.nextDouble();
            al.add(new Product(Name, Fild, id, price));
        }

        System.out.println("Show the All details : ");
        // System.out.println(" " + al);
        for (Object obj : al) {

            Product p = (Product) obj;
            System.out.println(" " + p.getId() + " " + p.getFild() + " " + p.getName() + " " + p.getPrice());
        }

        do {
            System.out.println("\n\n 1. Id wise Sorting the Acending: ");
            System.out.println("\n \n 2. Sortiing the NameWise: ");
            System.out.println("\n \n Enter the Your choice: ");
            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    SortByID srt = new SortByID();
                    Collections.sort(al, srt);
                    for (Product product : al) {

                        System.out.println("Id " + product.getFild() + "name : " + product.getName() + " "
                                + product.getPrice() + " " + product.getId());
                    }

                    break;

                case 2:
                    SortByName srtN = new SortByName();
                    Collections.sort(al, srtN);
                    for (Product product : al) {

                        System.out.println("\n \n Id " + product.getFild() + "name : " + product.getName() + " "
                                + product.getPrice() + " " + product.getId());
                    }

                    break;
                default:
                    System.out.println("You Choice the Wrong Option: ");
                    break;
            }

        } while (true);

    }
}
