
// 3. WAP to create the class Employee with a following methods  
// class Employee 
// {   void setPersonalInfo(String name,int id,int basicSal) 
//     { //in this function we need to store name ,id and basicSal in instance variable 
//     } 
//     void setProgressPer(int progress) 
//     { //if progress value is greater than 60 per then increase the basic salary of  
//       //employee with 30 percentage  
//     } 
//     void show() 
//     {//in this function we need to show the all details of employee like as  
//      //name id and basic salary as well as incremental salary and total salary of employee 
//     } 
// } 
// public class AreaApp 
// { 
//     public static void main(String x[]) 
//     {  // here create the object of Scanner class and accept the name id and basic salary as well  
//        //progress per value not need to calculate it by using formual directly enter e.g 70  
//        //means 70% 
//       //create the object of Employee class and call setPersonalInfo and pass name id and salary 
//      // in it as well as setProgressPer() and pass progress value in it 
//     //call the show() method of Employee class. 
//     } 
// }
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private int basicSal;
    private int totalSalary;
    private int incrementedSal;

    void setPersonalInfo(String name, int id, int basicSal) {
        this.id = id;
        this.basicSal = basicSal;
        this.name = name;
        totalSalary = basicSal;

    }

    void show() {
        System.out.println("id " + id + "Name: \t" + name + "basic Salary\t" + basicSal + "Progress" + totalSalary);

    }

    void setProgressPer(int progress) {

        if (progress > 60) {
            incrementedSal = (basicSal * 30 / 100); // 30% increment
            this.totalSalary = basicSal + incrementedSal; // Total salary a
        }

    }
}

public class Question3 {
    public static void main(String[] args) {
        int id, salary;
        String name;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the id");
        id = cin.nextInt();
        System.out.println("Enter the basic salary: \n");
        salary = cin.nextInt();
        cin.nextLine();
        System.out.println("Enter the name: \n");
        name = cin.nextLine();
        int progress;
        System.out.println("Enter the prograss: \n");
        progress = cin.nextInt();
        Employee emp = new Employee();
        emp.setPersonalInfo(name, id, salary);

        emp.setProgressPer(progress);
        emp.show();

    }

}
