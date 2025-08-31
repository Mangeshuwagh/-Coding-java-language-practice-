
// 6. create the class name as ConvertToUpper with a following methods 
// class ConvertToUpper 
// {  char c[]; 
//    void setCharArray(char ch[]) 
//    { //here accept the character array and store in instance variable in character array 
//      c=ch; 
//    } 
//    void convertToUpperCase() 
//    { //here we need to write the manual logics for converting lower case array 
//  //to upper case 
//    } 
// } 
// public class ConvertToUpperApp 
// { 
//    public static void main(String x[]) 
//    {   //here declare the fix array with a some character e.g char ch[]=new char[]={"good"}; 
//    //here create the object of ConvertToUpper class  
//      //call setCharArray() function and pass ch array in setCharArray() function 
//     //call convertToUpperCase() function and see the result 
//    } 
// } 
import java.util.Scanner;

class ConvertToUpper {

    public char ch[];
    // public String ch;

    // void setCharArray(char ch[]) 
     void setCharArray(String ch) 
    
    {
        // this.ch = ch;
        this.ch = ch.toCharArray();
    }

    void convertToUpperCase() {
        for (int i = 0; i <ch.length; i++) {
            if (ch[i] >= 'a' || ch[i] <= 'z')
                ch[i] = (char) (ch[i] - 32);
            
        }

    }

    void ShowConverUper() {
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

public class Question6 {

    public static void main(String[] args) {

        // char ch[] = new char[8];

        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the charater: \n");
        // for (int i = 0; i < ch.length; i++) {
        //     ch[i] = cin.nextLine().charAt(0);
        // }
        String name;
        name=cin.nextLine();
        ConvertToUpper c = new ConvertToUpper();
        c.setCharArray(name);
        c.convertToUpperCase();
        c.ShowConverUper();
    }
}
