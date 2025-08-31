
// Q2. WAP to create POJO class name as Student with field id,name and per and create array 
// of object student with size 5 and input the id of student and search
//  student record in student object array and if 
// student then display student found otherwise display message student not found.
import java.util.Scanner;

class Student {
    private int StuId;
    private String StName;
    private double Per;

    public void SetStudentId(int StuId) {
        this.StuId = StuId;
    }

    public int GetStudentId() {
        return StuId;

    }

    public void SetStudentName(String StName) {
        this.StName = StName;

    }

    public String GetStudentName() {
        return StName;
    }

    public void SetStudentPer(double Per) {
        this.Per = Per;
    }

    public double GetStudentPer() {
        return Per;
    }
}

public class ArrayObjectQ2 {

    public static void main(String[] args) {
        Student St[] = new Student[5];
        System.out.print("Enter the 5 data Student In the arra of object: \n");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < St.length; i++) {
            St[i] = new Student();

            int id;
            double per;
            String StuName;
            System.out.println("Enter the student id");
            id = cin.nextInt();
            cin.nextLine();
            System.out.println("Enter the Sudent name");
            StuName = cin.nextLine();
            System.out.println("Enter the Student Percentage: \n");
            // cin.nextInt();
            per = cin.nextDouble();

            St[i].SetStudentId(id);
            St[i].SetStudentName(StuName);
            St[i].SetStudentPer(per);

        }
        System.out.print(" Enter the id search the Studet\n");
        int Sid;
        Sid = cin.nextInt();
        for (int i = 0; i < St.length; i++) {
            if (St[i].GetStudentId() == Sid) {
                System.out.println(" Found the Student ");
                System.out.println("Student Id: " + St[i].GetStudentId() + "Student name : " + St[i].GetStudentName()
                        + "Student Percentage" + St[i].GetStudentPer());
                break;
            } else {
                System.out.println("Not found the Student");
                break;
            }
        }

    }

}
