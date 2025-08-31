import java.util.Scanner;

// Superclass
class Per {

    public int sub[];
    public int countMarks;
    private double per;

    // Method to calculate percentage
    public void calPer(int sub[]) {
        this.sub = sub;
        for (int i = 0; i < sub.length; i++) {
            countMarks += sub[i];
        }
        per = (double) countMarks / sub.length;
    }

    public double getPerMark() {
        return per;
    }
}

// Subclass CSE
class CSE extends Per {

    public int id;
    public String StuName, Address, year;

    // Parameterized constructor
    CSE(String StuName, int id, String Address, String year) {
        this.Address = Address;
        this.id = id;
        this.StuName = StuName;
        this.year = year;
    }

    // Method to show CSE student's percentage
    public void showCsePer() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + StuName);
        System.out.println("Student Address: " + Address);
        System.out.println("Student Year: " + year);
        System.out.println("Percentage: " + getPerMark());
    }
}

// Subclass ENG
class ENG extends Per {

    int id;
    String Stuname, year, Address;

    // Parameterized constructor
    ENG(String Stuname, int id, String Address, String year) {
        this.id = id;
        this.Stuname = Stuname;
        this.Address = Address;
        this.year = year;
    }

    // Method to show ENG student's percentage
    public void showENGPer() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + Stuname);
        System.out.println("Student Address: " + Address);
        System.out.println("Student Year: " + year);
        System.out.println("Percentage: " + getPerMark());
    }
}

// Driver class
public class Q2ResultApp {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int id;
        String StuName, Address, Year;

        // Input for CSE student
        System.out.println("Enter the CSE student Id: ");
        id = cin.nextInt();
        cin.nextLine();
        System.out.println("Enter the Student Name: ");
        StuName = cin.nextLine();
        System.out.println("Enter the Student Year: ");
        Year = cin.nextLine();
        System.out.println("Enter the Student Address: ");
        Address = cin.nextLine();

        int CseSub[] = new int[6];
        System.out.println("Enter the Student Subject Marks: ");
        for (int i = 0; i < CseSub.length; i++) {
            CseSub[i] = cin.nextInt();
        }
        CSE cse = new CSE(StuName, id, Address, Year); // CSE can now be instantiated correctly
        cse.calPer(CseSub);
        cse.showCsePer();

        System.out.println("_____________________________________________________________________");

        // Input for ENG student
        System.out.println("Enter the ENG student Id: ");
        id = cin.nextInt();
        cin.nextLine();
        System.out.println("Enter the Student Name: ");
        StuName = cin.nextLine();
        System.out.println("Enter the Student Year: ");
        Year = cin.nextLine();
        System.out.println("Enter the Student Address: ");
        Address = cin.nextLine();

        int EnggSub[] = new int[6];
        System.out.println("Enter the Student Subject Marks: ");
        for (int i = 0; i < EnggSub.length; i++) {
            EnggSub[i] = cin.nextInt();
        }
        ENG e = new ENG(StuName, id, Address, Year); // ENG can now be instantiated correctly
        e.calPer(EnggSub);
        e.showENGPer();
    }
}

/*
 * Changes made:
 * 1. Moved the `CSE` and `ENG` classes outside of the `Per` class to allow
 * direct instantiation in `Q2ResultApp`.
 * 2. Updated the code to reflect the changes, ensuring that the program
 * compiles and runs without errors.
 */
