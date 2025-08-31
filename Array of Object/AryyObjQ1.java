// // Q1. WAP to create POJO class name as Book with field id,name and price and create 5
// //  objects of book class using array of objects
// //  and arrange all books in descending order by using its price.

// import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

class Book {
   private String Bname;
   private int fieldid;
   private int price;

   public void SetBookId(int id) {
      this.fieldid = id;

   }

   public int GetBoodid() {
      return fieldid;
   }

   public void SetBookName(String Bname) {
      this.Bname = Bname;

   }

   public String GetBookName() {
      return Bname;

   }

   public void SetPrice(int price) {
      this.price = price;

   }

   public int GetPrice() {
      return price;
   }

}

public class AryyObjQ1 {

   public static void main(String[] args) {

      Book B[] = new Book[5];

      int id, Price;
      String BookName;
      System.out.println("Enter the 5 Book data ");
      Scanner cin = new Scanner(System.in);
      for (int i = 0; i < B.length; i++) {
         B[i] = new Book();
         System.out.print(" Enter the book id");
         id = cin.nextInt();
         // B[i].SetBookId()
         System.out.println("Enter the book name: ");
         cin.nextLine();
         BookName = cin.nextLine();
         System.out.print("Enter the price: \n");
         Price = cin.nextInt();
         B[i].SetBookId(id);
         B[i].SetBookName(BookName);
         B[i].SetPrice(Price);
      }

      for (int i = 0; i < B.length - 1; i++) {
         for (int j = i + 1; j < B.length; j++) {
            if (B[i].GetPrice() < B[j].GetPrice()) {
               Book temp = B[i];
               B[i] = B[j];
               B[j] = temp;
            }
         }
      }
      System.out.println("Show the Decending order All Book");
      // System.out.println("Book Id Book Name Book Price");
      for (int i = 0; i < B.length; i++) {
         System.out.println(
               "Book Id :" + B[i].GetBoodid() + "BOOk name   :" + B[i].GetBookName() + "BOOk Price  :"
                     + B[i].GetPrice());

      }
   }
}