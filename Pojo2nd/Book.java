import java.util.Scanner;
class Lib {
    private int id;
     private int  salary;
      private String name, fild;
      public void setid(int id)
      {
         this.id=id;
      }
     public int getid()
      {
         return id;
      }
      public void Setname(String name)
      {
         this.name = name;
      }
     public String getname()
     {
       return name;
     }
}
 class Book{
     public static void main(String[]args)
     {
         int id,price;
         String Bookname, fild;
          Scanner cin = new Scanner(System.in);

          System.out.println("Enter the id ");
          id=cin.nextInt(); 
          cin.nextInt();
           System.out.println("Enter the book name: \t ");
           Bookname=cin.nextLine();
           System.out.println("Enter the fild");
           fild=cin.nextLine();

           System.out.println("Enter the Price: \n");
        price=cin.nextInt();


     }
 }