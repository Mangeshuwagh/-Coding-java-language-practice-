// import java.util.Scanner;

// public class numbAlpha {

// 	public static void main(String[] args)

// 	{

// 		Scanner input = new Scanner(System.in);

// 		int number;
// 		System.out.print("Enter the number: \n");
// 		number = input.nextInt();
// 		int rev = 0;
// 		while (number != 0) {

// 			int rem = number % 10;
// 			rev = rem * 10 + rem;
// 			number /= 10;

// 		}

// 		while (rev != 0) {
// 			int choice = rev % 10;
// 			switch (choice) {
// 				case 0: {
// 					System.out.print("zero ");
// 					break;
// 				}
// 				case 1: {
// 					System.out.print("One ");
// 					break;
// 				}
// 				case 2: {
// 					System.out.print("Two ");
// 					break;
// 				}
// 				case 3: {
// 					System.out.print("Three ");
// 					break;
// 				}
// 				case 4: {
// 					System.out.print("Four ");
// 					break;
// 				}
// 				case 5: {
// 					System.out.print("Five ");
// 					break;
// 				}
// 				case 6: {
// 					System.out.print("Six ");
// 					break;
// 				}
// 				case 7: {
// 					System.out.print("Seven ");
// 					break;
// 				}
// 				case 8: {
// 					System.out.print("Eight ");
// 					break;
// 				}
// 				case 9: {
// 					System.out.print("Nine ");
// 					break;
// 				}

// 					rev /= 10;
// 					input.close();
// 			}
// 		}

// 	}

// }
import java.util.Scanner;

public class numbAlpha {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the number: \n");
int number = input.nextInt();
int rev = 0;

// Reverse the number
while (number != 0) {
int rem = number % 10;
rev = rev * 10 + rem;
number /= 10;
}

// Print the reversed number in words
while (rev != 0) {
int choice = rev % 10;
switch (choice) {
case 0:
System.out.print("Zero ");
break;
case 1:
System.out.print("One ");
break;
case 2:
System.out.print("Two ");
break;
case 3:
System.out.print("Three ");
break;
case 4:
System.out.print("Four ");
break;
case 5:
System.out.print("Five ");
break;
case 6:
System.out.print("Six ");
break;
case 7:
System.out.print("Seven ");
break;
case 8:
System.out.print("Eight ");
break;
case 9:
System.out.print("Nine ");
break;
}
rev = rev / 10;
}

input.close();
}
}
