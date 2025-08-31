
// Q4. Write program to Create class name as PersonalInfo with parameterized constructor  
// PersonalInfo(String name, String middlename, String lastname) and you have to create class name as  
// ProfessionalInfo with parameterized constructor like as ProfessionalInfo(int id,String des,int  
// salary,String skillset) and you have to inherit PersonalInfo class in ProfessionalInfo and pass  
// parameter from ProfessionalInfo class to PersonalInfo using super() constructor and you have to  
// define void show() method in ProfessionalInfo and you have to show the all data in show() method. 

import java.util.Scanner;

class PersonalInfo {

    protected String name, middlename, lastname;

    PersonalInfo(String name, String middlename, String lastname) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
    }

}

class ProfessionalInfo extends PersonalInfo {

    public int id, salary;
    String des, skillset;

    ProfessionalInfo(int id, String des, int salary, String skillset, String name, String middlename, String lastname) {

        super(name, middlename, lastname);
        this.id = id;
        this.des = des;
        this.salary = salary;
        this.skillset = skillset;

    }

    void show() {
        System.out.println(" first name: " + name + " Middle name: " + middlename + " last Nma: " + lastname);

        System.out.println(" id: " + id);
        System.out.println("des: " + des);
        System.out.println("salay: " + salary);
        System.out.println("skill set : " + skillset);
    }
}

public class ConQ4 {

    public static void main(String[] args) {

        String name, middlename, lastname;
        String des, skillset;

        int id, salary;

        ProfessionalInfo p = new ProfessionalInfo(id, des, salary, skillset, name, middlename, lastname);
        

    }

}
