
// 15) WAP to create the class name as Employee with a following setter and getter method 
// and create the array of objects with a 5 elements or values and store data in it and show 
// it. 

import java.util.Scanner;

class Employee {

    private int id;
    private int salary;
    private String Name;

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String GetName() {
        return Name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int Getsalary() {
        return salary;
    }
}

public class Question15 {

    public static void main(String[] args) {
        Employee e[] = new Employee[6];

        int id, salary;
        String Name;

        System.out.println("Enter the 6 emeloyee Data: ");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee();
            System.out.println("Enter the id");
            id = cin.nextInt();
            System.out.println("Enter the Name: ");
            cin.nextLine();
            Name = cin.nextLine();
            System.out.println("Enter the Salary: ");
            salary = cin.nextInt();
            e[i].setId(id);
            e[i].setName(Name);
            e[i].setSalary(salary);
        }

        System.out.println("Show the All Data of Employees");

        System.out.println(" ID       Employee Name      employee Salary");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].getId() + "        " + e[i].GetName() + "            " + e[i].Getsalary());
        }

    }

}
