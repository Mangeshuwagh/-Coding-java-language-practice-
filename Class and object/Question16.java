
// 16) WAP to create the class name as Employee class and create the array object of 
// Employee class of size 5 and store all data in it and arrange all employee data in ascending 
// order salary wise. 

import java.util.*;

class Employeess {

    private int id, salary;
    private String Name;

    public void setId(int id) {
        this.id = id;

    }

    public int GetId() {
        return id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String GetName() {
        return Name;
    }

    public void setSalary(int Salary) {
        salary = Salary;
    }

    public int Getsalary() {
        return salary;
    }
}

public class Question16 {

    public static void main(String[] args) {
        Employeess k[] = new Employeess[5];
        Scanner cin = new Scanner(System.in);

        int id, salary;
        String Name;
        System.out.println("Enter the 5 employee Data");
        for (int i = 0; i < k.length; i++) {
            k[i] = new Employeess();
            System.out.println(i + 1 + " Enter the id");
            id = cin.nextInt();
            System.out.println("Enter the Employee Name");
            cin.nextLine();
            Name = cin.nextLine();
            System.out.println("Enter the Salary");
            salary = cin.nextInt();

            k[i].setId(id);
            k[i].setName(Name);
            k[i].setSalary(salary);

        }

        System.out.println(" Id         Employee Name       Employee Salary");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i].GetId() + "        " + k[i].GetName() + "             " + k[i].Getsalary());
        }
        // logic Desending Order the the Employee Data:
        for (int i = 0; i < k.length; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i].Getsalary() > k[j].Getsalary()) {

                    Employeess E = k[i];
                    k[i] = k[j];
                    k[j] = E;
                }

            }
        }
        System.out.println("Show the All The Data : ");
        System.out.println(" Id         Employee Name       Employee Salary");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i].GetId() + "        " + k[i].GetName() + "             " + k[i].Getsalary());
        }
    }

}
