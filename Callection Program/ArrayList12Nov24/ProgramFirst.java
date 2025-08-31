
// Q1. WAP to create Book Storage application using ArrayList?
//    case 1: Add New Book
//   Case 2: View all Books 
//   Case 3: Search book by name of author  or by name of book
//   Case 4: count the authorwise book
//   Case 5: Count the total number of book
//   Case 6: Display the authorwise books 

// import java.util.ArrayList;
import java.util.*;
// import java.util.Scanner;

public class ProgramFirst {

    public static void main(String[] args) {
        ArrayList arli = new ArrayList<>();

        Scanner cin = new Scanner(System.in);
        char ch;
        do {
            System.out.println("case 1: Add New Book\r\n" + //
                    "//   Case 2: View all Books \r\n" + //
                    "//   Case 3: Search book by name of author \r\n" + //
                    "//   Case 4: count the authorwise book\r\n" + //
                    "//   Case 5: Count the total number of book\r\n" + //
                    "//   Case 6: Display the authorwise books ");
            System.out.println("Enter the Your choice: ");
            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    cin.nextLine();
                    System.out.println("Enter the Book Name");
                    String bookName = cin.nextLine();
                    System.out.println("Enter the Book Id");
                    int Id = cin.nextInt();
                    System.out.println("Enter the Book Author: ");
                    cin.nextLine();
                    String booAuthor = cin.nextLine();
                    System.out.println("Enter the Publication");
                    String pub = cin.nextLine();

                    Book boObj = new Book(bookName, booAuthor, pub, Id);
                    arli.add(boObj);
                    System.out.println("Details added successfully!");
                    break;
                case 2:
                    System.out.println("Show the All the Book:.....");
                    if (arli.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Object obj : arli) {

                            Book b = (Book) obj;
                            System.out.println(b.getBookName());
                        }
                    }
                    cin.nextLine();
                    break;
                case 3:
                    // search the Book Athorwise a book
                    System.out.println("Enter the BookAuthor name: ");
                    cin.nextLine();
                    String autName = cin.nextLine();
                    boolean checkk = false;
                    for (Object obj : arli) {

                        Book b = (Book) obj;

                        if (b.getBookAuthor().equalsIgnoreCase(autName)) {
                            checkk = true;
                            System.out.println("Found: " + b.getBookName() + " by " + b.getBookAuthor());
                            checkk = true;
                        }
                    }
                    if (!checkk) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    // Count the authorwise books using HashMap
                    HashMap<String, Integer> authorCount = new HashMap<>();
                    for (Object obj : arli) {
                        Book b = (Book) obj;
                        String author = b.getBookAuthor();
                        // Increment count for the author
                        authorCount.put(author, authorCount.getOrDefault(author, 0) + 1);
                    }
                    // Display the authorwise count
                    for (Map.Entry<String, Integer> entry : authorCount.entrySet()) {
                        System.out.println(entry.getKey() + " has " + entry.getValue() + " book(s).");
                    }
                    cin.nextLine();
                    break;
                // for (Object object : arli) {

                // Book b = (Book) object;
                // int count = 0;
                // for (Object object2 : arli) {
                // Book bb = (Book) object2;
                // if (b.getBookAuthor().equalsIgnoreCase(bb.getBookAuthor())) {
                // count++;
                // }
                // }
                // if (b.getBookAuthor()!=null) {
                // System.out.println(b.getBookAuthor() + "...................." + count);
                // }
                // }
                // break;
                case 5:
                    // count the total numbers of book
                    System.out.println(" Total numbers of Book: " + arli.size());
                    cin.nextLine();
                    break;
                case 6:
                    // aauthowerise
                    System.out.println(" show the book authorwise: ");
                    System.out.println(
                            " ID : \t \t:  Book Name: \t \t :Book Author: \t \t :Book Publication : \n");
                    for (Object object : arli) {
                        Book b = (Book) object;
                        for (Object object2 : arli) {
                            Book b1 = (Book) object2;
                            if (b.getBookAuthor().equalsIgnoreCase(b1.getBookAuthor())) {
                                System.out
                                        .println("" + b1.getId() + "\t\t" + b1.getBookName()
                                                + "\t : "
                                                + b1.getBookAuthor() + "\t \t" + b1.getPublication());
                            }
                        }

                    }
                    cin.nextLine();
                    break;
                default:
                    System.out.println("You Choice a wrong plz once again you read the Menu");
                    break;
            }
            // Inside your main method, at the end of the do-while loop
            System.out.println("Do you want to continue? Press 'y' or 'Y' to continue:");
            String input = cin.nextLine();
            if (input.isEmpty()) {
                ch = 'n'; // If the input is empty, set 'ch' to 'n'
            } else {
                ch = input.charAt(0); // Otherwise, get the first character
            }

        } while (ch == 'y' || ch == 'Y');
    }
}