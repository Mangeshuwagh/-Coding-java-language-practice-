
// 4.Department-Wise Employees (Map + List + Custom Class)
// Create a class Employee with fields: id, name, and salary.

// Store employees department-wise in a Map<String, List<Employee>>.

// For each department, print the employee details.
import java.util.*;

import javax.swing.border.EmptyBorder;

class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id " + id + " Name : " + name + " Salary: " + salary;
    }
}

public class Program4th {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        HashMap<String, List<Employee>> li = new HashMap<>();
        List<Employee> emp = new ArrayList<>();
        List<Employee> emp2 = new ArrayList<>();
        List<Employee> emp3 = new ArrayList<>();
        System.out.println(" Enter the Devloper departments ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter the Id\n ");
            int id = cin.nextInt();
            System.out.println("Enter employee name: ");
            cin.nextLine();
            String name = cin.nextLine();
            System.out.println(" Enter the salary: ");
            int salary = cin.nextInt();

            emp.add(new Employee(id, name, salary));
        }

        li.put("Devloper", emp);

        System.out.println("Ente the Testing Departments : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter the Id\n ");
            int id = cin.nextInt();
            System.out.println("Enter employee name: ");
            cin.nextLine();
            String name = cin.nextLine();
            System.out.println(" Enter the salary: ");
            int salary = cin.nextInt();

            emp2.add(new Employee(id, name, salary));
        }

        li.put("Testing ", emp2);

        System.out.println(" Enter the Support departments ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter the Id\n ");
            int id = cin.nextInt();
            System.out.println("Enter employee name: ");
            cin.nextLine();
            String name = cin.nextLine();
            System.out.println(" Enter the salary: ");
            int salary = cin.nextInt();

            emp3.add(new Employee(id, name, salary));
        }

        li.put("Support ", emp3);

        System.out.println(" Show the All the Departments and Employees Details ");

        for (Map.Entry<String, List<Employee>> fetch : li.entrySet()) {

            String department = fetch.getKey();
            System.out.println(" Show the Department: \n " + department);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
            List<Employee> empp = fetch.getValue();
            System.out.println("Employee Id:\t " + "Emloyee Name: \n" + "Employee Salary");
            for (Employee emppp : empp) {
                System.out.println(emppp.getId() + " \t" + emppp.getName() + " \t" + emppp.getSalary());
            }
            System.out.println(" ");

        }
    }

}
