// Q3. WAP to create Employee class with field id,name and sal and store 5 employee object in ArrayList and display it

import java.util.*;

class enployee {
    private int id;
    private String name;
    private double sal;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setEmployee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: " + id + ", Name: " + name + ", Salary: " + sal;
    }

}

public class Emplyee {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // ArrayList
        ArrayList<enployee> arli = new ArrayList<>();

        int id;
        String name;
        double sal;
        // int size = arli.size();
        System.out.println("Enter the Details ");
        for (int i = 0; i < 5; i++) {
            enployee e = new enployee();
            System.out.println("Enter the id ");
            id = cin.nextInt();
            System.out.println("Enter the Employee name");
            name = cin.nextLine();
            cin.nextLine();
            System.out.println("Enter the Emplyee Sal");
            sal = cin.nextDouble();
            // arli.add(id, name, sal);
            e.setEmployee(id, name, sal);
            arli.add(e);

        }

        // System.out.println(arli);
        System.out.println("Show the All emloyee: ");
        for (enployee enployee : arli) {
            System.out.println(enployee);

        }
        cin.close();

    }

}
