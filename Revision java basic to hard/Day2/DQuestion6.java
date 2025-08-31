
// Q5. Write program to create POJO class name as Employee with id,name and salary attribute and 
// store data in object and retrieve data from object

import java.util.Scanner;

class Employee {

    int id, salary;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String geName() {
        return name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class DQuestion6 {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Mangesh");
        e.setid(1);
        e.setSalary(10000);
        System.out.println(" information: " + e.getid() + " \n" + e.geName() + "\n" + e.getSalary());

    }

}
