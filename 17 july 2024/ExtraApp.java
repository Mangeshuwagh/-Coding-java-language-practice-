
// Q3. WAP to create class name as ExtractDigitAndSum with two functions 
// void setValue(char[]): this function can accept character array as parameter 
// int getSum(): this function can extract digit from number and calculate its sum and return it.
// Example: abc123mno45
// Output: 1+2+3+4+5 = 15

import java.util.Scanner;

class ExtraDigit {
   char ch[];

   void setCharater(char ar[]) {
      ch = ar;

   }

   int GetChar() {
      int sum = 0;
      for (int i = 0; i < ch.length; i++) {
         if (ch[i] >= '0' && ch[i] <= '9') {
            sum = sum + (ch[i] - '0');

         }
      }

      return sum;
   }
}

public class ExtraApp {

   public static void main(String[] args) {

      Scanner cin = new Scanner(System.in);
      System.out.println("Enter the charater and numbers: \n");
      String input = cin.nextLine(); // Read the entire line of input
      // char c[] = new char[11];
      // []c=input.toCharArray();
      char[] c = input.toCharArray(); // Convert the input string to a character array
      // for (int i = 0; i < c.length; i++) {
      // // c[i]=cin.nextChar();
      // c[i] = cin.next().charAt(0); // Read a single character
      // }
      // System.out.print("Enter the number: \n");

      ExtraDigit e = new ExtraDigit();
      e.setCharater(c);
      System.out.println(" show the sum in extara dogit \t" + e.GetChar());
   }
}
