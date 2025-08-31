// Q4. Write program to Create class name as PersonalInfo with parameterized constructor  
// PersonalInfo(String name, String middlename, String lastname) and you have to create class name as 
// ProfessionalInfo with parameterized constructor  like as ProfessionalInfo(int id,String des,int 
// salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass 
// parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to 
// define void show() method in ProfessionalInfo and you have to show the all data in show() method. 

import java.util.Scanner;

class PersonalInfo {

    public String name, middlename, lastname;

    PersonalInfo(String name, String middlename, String lastname) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;

    }
}

class ProfessionalInfo extends PersonalInfo {

    int id, salary;
    String skillset, des;

    ProfessionalInfo(int id, String des, int salary, String skillset, String name, String middlename, String lastname) {
        super(name, middlename, lastname);

        this.id = id;
        this.skillset = skillset;
        this.des = des;
    }

    void show() {
        System.out.println("Employee Name: " + name + " " + middlename + " " + lastname);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + des);
        System.out.println("Salary: " + salary);
        System.out.println("Skillset: " + skillset);
    }

}

public class D3Quetion4 {
    public static void main(String[] args) {
        String name, middlename, lastname;
        int id, salary;
        String des, skillset;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the Emloyee First name: ");
        name = cin.nextLine();
        System.out.println("Enter the middle name: ");
        middlename = cin.nextLine();
        System.out.println("Enter the last name: ");
        lastname = cin.nextLine();

        System.out.println("Enter the id a and salary and des and skills");
        id = cin.nextInt();
        salary = cin.nextInt();
        cin.nextLine();
        des = cin.nextLine();// Designation : Software Engineer write here
        skillset = cin.nextLine();

        ProfessionalInfo p = new ProfessionalInfo(id, des, salary, skillset, name, middlename, lastname);
        p.show();

    }

}
