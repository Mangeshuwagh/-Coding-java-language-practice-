// WAP to create POJO class  name Book with field id,name and author and
//  create array of object of size 5 and find the author whose name ends with (sh)

import java.util.*;

public class PracticalFive {

    public static void main(String[] args) {

        String name, author, field;

        int id;
        Book[] bk = new Book[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Details : ");
        for (int i = 0; i < bk.length; i++) {
            System.out.println(" " + (i + 1));

            System.out.println("Enter the Book Name: ");
            name = input.nextLine();
            System.out.println("Enter the id : : ");
            id = input.nextInt();
            input.nextLine();
            System.out.println("Enter the Book Author: ");
            author = input.nextLine();

            System.out.println("Enter the Book field: ");
            field = input.nextLine();

            bk[i] = new Book(name, author, id, field);
        }

        // System.out.println("Show the All Details ");
        // System.out.println("Book_Id\t\tBook_Name\t\tBook_Author\t\tBook_Field");
        // for (int i = 0; i < bk.length; i++) {
        // System.out.println(bk[i].getId() + "\t\t" + bk[i].getName() + "\t\t" +
        // bk[i].getAuthor()
        // + "\t\t" + bk[i].getField());
        // }

        Vector<Book> vector = new Vector<>();

        for (int i = 0; i < bk.length; i++) {
            vector.add(bk[i]);
        }
        // System.out.println(vector);
        System.out.println("\nShow All Details:");
        System.out.println("Book_Id\tBook_Name\tBook_Author\tBook_Field");
        for (int i = 0; i < vector.size(); i++) {
            Book book = vector.get(i);
            System.out.println(
                    book.getId() + "\t\t" + book.getName() + "\t\t" + book.getAuthor() + "\t\t\t" + book.getField());
        }

        System.out.println("Check the Authors name is  the last of Sh");
        System.out.println("\nShow All Details:");
        System.out.println("Book_Id\tBook_Name\tBook_Author\tBook_Field");
        boolean found = false;
        for (int i = 0; i < bk.length; i++) {
            Book book = vector.get(i);

            if (book.getAuthor().endsWith("sh")) {

                // System.out.println();
                System.out.println(book.getId() + "\t\t" + book.getName() + "\t\t" + book.getAuthor() + "\t\t\t"
                        + book.getField());
                found = true;
            }
        }
        if (!found) {

            System.out.println("authour is not foud the last of sh");
        }

    }
}
