import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int id, Salary;
        // String name;
        // System.out.println("Enter the id");
        // Scanner cin = new Scanner(System.in);
        // id = cin.nextInt();
        // System.out.println("Enter the name: ");
        // cin.nextLine();
        // name = cin.nextLine();
        // System.out.println("Enter the Salary: \n");
        // Salary = cin.nextInt();

        Object o = new Object();
        Book b = new Book();
        b.setId(1);
        b.Setname("Mangesh");
        b.setSalary(1900);
        o.addNewBook(b);
        o.ShowDetail();

    }
}
