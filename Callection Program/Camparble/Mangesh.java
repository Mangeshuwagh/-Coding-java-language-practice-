
import java.util.*;

public class Mangesh {

    public static void main(String[] args) {

        int id, sal;
        String name;
        Scanner cin = new Scanner(System.in);
        int size;

        System.out.println("Enter the size");
        size = cin.nextInt();
        ArrayList<Employee> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Id : ");
            id = cin.nextInt();
            System.out.println("enter the NAme:");
            cin.nextLine();
            name = cin.nextLine();
            System.out.println("enter salary:  ");
            sal = cin.nextInt();
            al.add(new Employee(id, sal, name));
        }
        System.out.println(" show the all members And information : ");
        for (Employee emp : al) {
            System.out.println(" Id " + emp.getId() + "Name: " + emp.getName() + " Salary: " + emp.getSal());
        }
        Collections.sort(al);
        System.out.println("Display the Data after sorting : \n\n");
        for (Object obj : al) {
            Employee e = (Employee) obj;
            System.out.println(" Id: " + e.getId() + " Name: " + e.getName() + "Salary " + e.getSal());
        }
    }
}
