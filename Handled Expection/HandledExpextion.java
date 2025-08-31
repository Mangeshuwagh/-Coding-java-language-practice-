import java.util.InputMismatchException;
import java.util.Scanner;

public class HandledExpextion {

    public static void main(String[] args) {

        char ch;

        do {

            System.out.println("try to  all expection ");
            System.out.println("1) Array Index Out of BoundExp ");
            System.out.println("2) String Index Out of BoundExp ");
            System.out.println("3) ArithMatic Expection ");
            System.out.println("4) Null Pointer Expection ");
            System.out.println("5) Number Formate Expection: ");
            System.out.println("6) Input Mistch Match Expection ");
            System.out.println("7) Class not found Expection ");
            System.out.println(" ****** Enter the your choice: ******* ");

            Scanner cin = new Scanner(System.in);
            int choice = cin.nextInt();

            switch (choice) {
                case 1:
                    try {
                        int a[] = new int[5];
                        System.out.println("show the array One index: " + a[10]);

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Array Index Out Of BOunds Excpection: " + e);
                    }
                    break;
                case 2:
                    try {
                        String Name = "Mangesh Wagh";
                        System.out.println("Show the String Index Int here : " + Name.charAt(10));
                    } catch (StringIndexOutOfBoundsException e) {

                        // TODO: handle exception
                        System.out.println(" String the Index Out of Bound: " + e);
                    }
                    break;
                case 3:
                    try {
                        int n = 10;
                        int b = 0;
                        int c = 10 / 0;
                        System.out.println("Arithmatic expection is Bounds: " + c);
                    } catch (ArithmeticException e)

                    {
                        System.out.println("Arithmatic expection is Bounds:" + e);

                    }
                    break;
                case 4:
                    try {
                        String Name = null;
                        System.out.println(" Count the length of String: " + Name.length());
                    } catch (NullPointerException e) {
                        System.out.println("Null Pointer Expextion " + e);
                    }
                    break;
                case 5:
                    try {
                        int number = Integer.parseInt("m,n,a");
                        System.out.println("Number formate expection: " + number);
                    } catch (NumberFormatException e) {
                        System.out.println("Number Formate Expection + " + e);
                        // TODO: handle exception
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Enter an integer: ");
                        int number = cin.nextInt(); // Expecting an integer
                    } catch (InputMismatchException e) {
                        System.out.println("InputMismatchException caught: " + e);
                    }
                    break;

                case 7:
                    try {
                        Class.forName("com.nonexistent.Class");
                    } catch (ClassNotFoundException e) {
                        System.out.println(" Class not Found Expection: " + e);
                    }
                    break;

                default:
                    System.out.println("you Enter the wrong numbers: \n");
                    break;
            }
            System.out.println(" You want the Continue so press y or Y onther press any key: ");
            ch = cin.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }
}

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class ExceptionHandlingDemo {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Choose a case number (1-7) to handle a specific
// exception:");
// System.out.println("1: ArrayIndexOutOfBoundsException");
// System.out.println("2: StringIndexOutOfBoundsException");
// System.out.println("3: ArithmeticException");
// System.out.println("4: NullPointerException");
// System.out.println("5: NumberFormatException");
// System.out.println("6: InputMismatchException");
// System.out.println("7: ClassNotFoundException");

// int choice = scanner.nextInt();

// switch (choice) {
// case 1:
// // Handle ArrayIndexOutOfBoundsException
// try {
// int[] arr = new int[5];
// System.out.println(arr[10]); // Accessing an invalid index
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
// }
// break;

// case 2:
// // Handle StringIndexOutOfBoundsException
// try {
// String str = "Hello";
// System.out.println(str.charAt(10)); // Accessing an invalid index
// } catch (StringIndexOutOfBoundsException e) {
// System.out.println("StringIndexOutOfBoundsException caught: " + e);
// }
// break;

// case 3:
// // Handle ArithmeticException
// try {
// int result = 10 / 0; // Division by zero
// } catch (ArithmeticException e) {
// System.out.println("ArithmeticException caught: " + e);
// }
// break;

// case 4:
// // Handle NullPointerException
// try {
// String str = null;
// System.out.println(str.length()); // Null reference
// } catch (NullPointerException e) {
// System.out.println("NullPointerException caught: " + e);
// }
// break;

// case 5:
// // Handle NumberFormatException
// try {
// int num = Integer.parseInt("ABC"); // Invalid number format
// } catch (NumberFormatException e) {
// System.out.println("NumberFormatException caught: " + e);
// }
// break;

// case 6:
// // Handle InputMismatchException
// try {
// System.out.print("Enter an integer: ");
// int number = scanner.nextInt(); // Expecting an integer
// } catch (InputMismatchException e) {
// System.out.println("InputMismatchException caught: " + e);
// }
// break;

// case 7:
// // Handle ClassNotFoundException
// try {
// Class.forName("com.nonexistent.Class"); // Invalid class name
// } catch (ClassNotFoundException e) {
// System.out.println("ClassNotFoundException caught: " + e);
// }
// break;

// default:
// System.out.println("Invalid choice! Please select a number between 1 and
// 7.");
// break;
// }

// scanner.close();
// }
// }
