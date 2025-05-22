
// Q7. Write a program to Create ArrayList and Store 5 employee objects in it and perform following operation 
// 	Case 1: sort employee by using id 
// 	Case 2: sort employee by using salary
// 	Case 3: sort employee  by using name

import java.util.*;
// import java.Comparable;

class Employees {

    private int EmpId;
    private int Esalary;
    private String EmpName;

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setEsalary(int esalary) {
        Esalary = esalary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getEsalary() {
        return Esalary;
    }

    public Employees(int EmpId, String EmpName, int Esalary) {
        this.EmpId = EmpId;
        this.Esalary = Esalary;
        this.EmpName = EmpName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Employee ID: " + EmpId + "Employee Name:  " + EmpName + " Employee Salary: " + Esalary;
    }

}

class SotrByID implements Comparator<Employees> {

    @Override
    public int compare(Employees e1, Employees e2) {
        // TODO Auto-generated method stub
        if (e1.getEmpId() > e2.getEmpId()) {
            return 1;

        } else if (e1.getEmpId() < e2.getEmpId()) {
            return -1;

        } else {
            return 0;

        }
    }

}

public class Sortpr7 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        ArrayList<Employees> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(" Enter the Employee Id ");
            int id = cin.nextInt();
            System.out.println("Enter the Employee Name ");
            cin.nextLine();
            String name = cin.nextLine();
            System.out.println("Enter the Employee salary");
            int sal = cin.nextInt();

            list.add(new Employees(id, name, sal));

        }
        System.out.println(" Show the Employee ");
        // System.out.println(list);
        for (Employees e : list) {

            System.out.println(e);
        }

        SotrByID st = new SotrByID();
        Collections.sort(list, st);

        System.out.println(" After the Sorting the Array: ");
        for (Employees e : list) {

            System.out.println(e);
        }

    }
}
