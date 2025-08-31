
// 10) WAP to create the pojo class name as Student class with a following methods and data 
// or variable/state 
// class Student 
// {   int id;String name;float per; 
//     int totalFees;int disFees; 
//     int actualPaidFees; 
// void setId(int id) 
//     { this.id=id; 
//     } 
//     int getId() 
//     { return id; 
//     } 
//     void setName(String name) 
//      { this.name=name; 
//      } 
//    String getName() 
//     { return name; 
//    } 
//  //do setter and getter for all students 
// } 
// Create the class name as DiscountFees and this class is depend on Student class means in this class 
// we need to write a method setStudent() and accept the reference of Student class in it  
// As well as we need to define two another method in this class name as  checkDiscountEligibility(int 
// per) -> this function accept the per of student if per greater than 60 then student is eligible for 
// discout and give the 30% discount on fees and update in student object  
// And we need to write one more function in DiscountFees class show() and in this function contain 
// the logics for display the all details of Students with discounted fees 
// Following sample code gives the completed structure about the two class with empty methods. 

// Also create the main method class with a following operation given below. 
// public class StudentDiscountApp 
// { 
//     public static void main(String x[ ]) 
//     {  //create the object of Scanner class 
//       //declare the variables for id,name ,per,totalFees,per and accept the input and store its value in 
// variable usign scanner 
//    //create the object of student class and store the values in object using setter methods 
// //create the object of DiscountFees class and call setStudent() method and pass student class 
// reference in it 
//   //call the checkDiscountEligilibility() method and pass per in it accepted from keyboard 
// //call show() method here 
//     } 
// }
import java.util.Scanner;

class Student {

    int id;
    String name;
    float per;
    int totalFees;
    int disFees;
    int actualPaidFees;

    public void SetId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void SetPer(float per) {
        this.per = per;
    }

    public float Getper() {
        return per;
    }

    public void SettotalFees(int totalFees) {
        this.totalFees = totalFees;
    }

    public int GettotalFees() {
        return totalFees;
    }

    public void setDisFees(int disFees) {
        this.disFees = disFees;
    }

    public int getDisFees() {
        return disFees;
    }

    public void SetactualPaidFees(int actualPaidFees) {
        this.actualPaidFees = actualPaidFees;
    }

    public int GetactualPaidFees() {
        return actualPaidFees;
    }
}

class DiscountFees {

    Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void checkDiscountEligibility(float per) {
        if (per > 60) {

            int Dic = (student.GettotalFees() * 30) / 100;
            // int fee = Dic - student.GettotalFees();
            student.setDisFees(Dic);
            student.SetactualPaidFees(student.GettotalFees() - Dic);
        } else {
            student.setDisFees(0);
            student.SetactualPaidFees(student.GettotalFees());
        }
    }

    public void show() {

        System.out.println(" ID: " + student.getId());
        System.out.println(" Student name: " + student.getName());
        System.out.println("Percentage: " + student.Getper());
        System.out.println("Total fee: " + student.GettotalFees());
        System.out.println("Discount in fee: " + student.getDisFees());
        System.out.println("  Actual fee: " + student.GetactualPaidFees());
    }

}

public class Question10 {
    public static void main(String[] args) {
        float per;
        int id, totalFees;
        String name;
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the Student id");
        id = cin.nextInt();
        System.out.println("Enter the Student name: ");
        cin.nextLine();
        name = cin.nextLine();
        System.out.println("Enter the student Percentage: \n");
        per = cin.nextFloat();
        System.out.println("Enter the Total  fee : ");
        totalFees = cin.nextInt();
        Student s = new Student();
        s.SetId(id);
        s.setName(name);
        s.SetPer(per);
        s.SettotalFees(totalFees);
        DiscountFees D = new DiscountFees();
        D.setStudent(s);
        D.checkDiscountEligibility(per);
        D.show();

        // declare the variables for id,name ,per,totalFees,per and accept the input and
        // store its value in
        // variable usign scanner
    }

}
