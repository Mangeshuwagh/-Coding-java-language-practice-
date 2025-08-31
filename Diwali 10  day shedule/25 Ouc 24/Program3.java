// Q3. Write a Java program to create a class called "Employee" with a name, job title, and
// salary attributes, and methods to calculate and update salary.

import java.util.Scanner;

class Employee {

    private String name, job_title;
    private int salary;

    public Employee(String name, String job_title, int salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob_title() {
        return job_title;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int newSalry) {
        this.salary = newSalry;
    }

    public void salIncreamet(int per) {
        salary += salary * ((double) per / 100);

    }

}

public class Program3 {

    public static void main(String[] args) {
        String Ename, job_title;
        int Salary;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Employee name: ");
        Ename = cin.nextLine();
        System.out.println("Enter the Job Title: ");
        job_title = cin.nextLine();
        System.out.println("Enter the Salary:");
        Salary = cin.nextInt();

        Employee e = new Employee(Ename, job_title, Salary);

        System.out.println("Employee name: " + e.getName());
        System.out.println("Employee Job_Title: " + e.getJob_title());
        System.out.println("Employee salary: " + e.getSalary());

        System.out.println("Enter the Upadate the Salary: ");
        Salary = cin.nextInt();
        e.updateSalary(Salary);
        System.out.println("Enter the percentage the ");

        int per = cin.nextInt();
        e.salIncreamet(per);

        System.out.println("Upadate the Employee salary: ");
        System.out.println("Employee name: " + e.getName() + "\n Employee Job_title: " + e.getJob_title()
                + "\n Employee Increments salary: " + per + "\n Employee Update Salary" + e.getSalary());

    }

}
