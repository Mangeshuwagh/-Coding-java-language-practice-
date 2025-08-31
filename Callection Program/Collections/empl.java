import java.util.*;

public class empl {

    public static void main(String[] args) {

        int id, salary;
        String name;

        Scanner cin = new Scanner(System.in);

        // Employee emp = new Employee();
        ArrayList<employyesss> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the your id: \n");
            id = cin.nextInt();
            System.out.println("Enter the Name: ");
            cin.nextLine();
            name = cin.nextLine();
            System.out.println("Enter the Employee Salary: ");
            salary = cin.nextInt();

            // al.add(new Employee(id, salary, name));
            al.add(new employyesss(id, salary, name));
        }

        for (employyesss emp : al) {
            System.out.println(" " + emp.getEmpName() + " " + emp.getId() + " " + emp.getSalary());
        }

    }

}
