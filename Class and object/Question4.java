
// 4. WAP to create the class name as Student with a following methods  
// class Student 
// { void setSubMarks(int s[]) 
//    { //here we need to store the array in instance variable  
//    } 
//    void calculatePer() 
//    { //here we need to call the aggregate of six subjects marks through the array and calculate its per 
// and store in instance variable. 
//    }  
//    void checkGrades() 
//    { //here we need to check grades means per>75 && per<=100 then student in distinction  if per>60 
// && per<=75 then in first division  if per>=50 && per<=60 then second division and if per>40 && 
// per<=50 then in third division and if per <40 then  student failed  
//    } 
// } 
// public class StudentApp 
// {   public static void main(String x[]) 
//     { //create the object of scanner class 
//      //declare the array with 6 six of type integer and store input values in array as subject marks 
//     //create the object of Student class and call the setSubMarks() function and pass array in it 
//    //then call calculatePer() student function 
//   //then call checkGrades() function for checking the grading of students. 

//     }
import java.util.Scanner;

class Student {
    int s[];
    int Totalmarks = 0;
    int per;

    void setSubMarks(int s[]) {
        this.s = s;

    }

    public void calcilatePercentage() {

        for (int i = 0; i < s.length; i++) {
            Totalmarks = Totalmarks + s[i];

        }
        System.out.println("Total marks: \t" + Totalmarks);
        per = Totalmarks / 5;
        System.out.println("Show the total percentage: \n" + per);
    }

    void checkGrades() {
        if (per > 75 && per <= 100) {
            System.out.println("Exeland class");
        } else if (per > 60
                && per <= 75) {
            System.out.println("First class");
        } else if (per >= 50 && per <= 60) {
            System.out.println("Second class");
        } else if (per > 40 && per <= 50) {
            System.out.println("third class");

        } else if (per < 40) {
            System.out.println(" fial");
        }

    }
}

public class Question4 {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Enter the 5 sub marks:\n");

        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        Student S = new Student();
        S.setSubMarks(a);
        S.calcilatePercentage();
        S.checkGrades();
    }
}
