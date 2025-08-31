
import java.util.Scanner;

public class AllString {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char ch;

        do {
            System.out.println("1) Reversing the String: ");
            System.out.println("2) Inserting the Charaters ");
            System.out.println("3) Appending the String ");
            System.out.println("4) Deleting the Charater from string ");
            System.out.println("5) Replace a SubString ");
            System.out.println("6) Check capacity, ensure Capacity from String Buffer Class");
            System.out.println("7) Demonstrate chaining methods using String Buffer");

            System.out.println("\n\n\n Enter your choice:");
            int choice = cin.nextInt();
            cin.nextLine(); // Consume newline left-over after nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Enter the String: ");
                    String name = cin.nextLine(); // Now it will take the input correctly
                    System.out.println("Reverse the String:");
                    System.out.println("Your String is: " + name);
                    int le = name.length();
                    char[] h = new char[le];
                    for (int i = 0; i < le; i++) {
                        h[i] = name.charAt(i);
                    }
                    int start = 0;
                    int end = le - 1;
                    for (int i = 0; i < le / 2; i++) {
                        char s = h[start];
                        char e = h[end];
                        h[start] = e;
                        h[end] = s;
                        start++;
                        end--;
                    }
                    name = new String(h); // Store the characters in the string
                    System.out.println("Converted by Reverse: " + name);
                    break;

                case 2:
                    System.out.println("Enter the String: ");
                    String Name = cin.nextLine(); // Fixed input for this case too
                    System.out.println("\nShow the String: " + Name);

                    System.out.println("Enter the Character: ");
                    char ad = cin.next().charAt(0);

                    System.out.println("Enter the Position in the String where you store the Character: ");
                    int Pos = cin.nextInt();
                    cin.nextLine(); // Consume newline

                    int l = Name.length();

                    char[] addChar = new char[l + 1];
                    char[] Original = Name.toCharArray();

                    for (int i = 0; i < Pos; i++) {
                        addChar[i] = Original[i]; // Store the first part of the original array
                    }
                    addChar[Pos] = ad; // Insert character at position

                    for (int i = Pos; i < l; i++) {
                        addChar[i + 1] = Original[i];
                    }

                    Name = new String(addChar);
                    System.out.println("Added the Character in the String: " + Name);
                    break;

                case 3:
                    System.out.println("Appending the String ");
                    System.out.println("Enter the First String: ");
                    String First = cin.next();
                    char[] fi = First.toCharArray();
                    System.out.println("Enter the Second String: ");
                    String Second = cin.next();
                    char[] se = Second.toCharArray();

                    int toLen = First.length() + Second.length();
                    char[] addAll = new char[toLen + 1];

                    int k = 0;
                    for (int i = 0; i < First.length(); i++) {
                        addAll[k] = fi[i];
                        k++;
                    }

                    addAll[k] = ' ';
                    k++;
                    for (int j = 0; j < Second.length(); j++) {
                        addAll[k] = se[j];
                        k++;
                    }
                    String appendedString = new String(addAll);
                    System.out.println("Result after adding two Strings: " + appendedString);
                    break;

                case 4:
                    System.out.println("Enter the String: ");
                    String stor = cin.nextLine();
                    char del[] = new char[stor.length()];
                    // stor.toCharArray();
                    System.out.println("Show the String: " + stor);
                    System.out.println("Enter the Charater we Want the Deleting: ");
                    char de = cin.next().charAt(0);
                    int q = 0;
                    for (int i = 0; i < stor.length(); i++) {
                        if (stor.charAt(i) != de) {// the same the charater in the String so the Skip the charter as
                                                   // deleting
                            del[q] = stor.charAt(i); // not same is store

                            q++;// increment

                        }
                    }

                    String deletersting = new String(del);// create the new String

                    System.out.println("Show the Deleteinng String: " + deletersting);// show the After String :

                    break;

                case 5:
                    System.out.println("Enter the New Strin: ");

                    String nstring = cin.nextLine();
                    System.out.println("Show the String: " + nstring);
                    System.out.println("Enter the Substring you want to replace: ");

                    String OldWord = cin.nextLine();

                    System.out.println(" Enter the new Substring: ");

                    String newWord = cin.nextLine();

                    String result = "";
                    int olength = OldWord.length();
                    int nlength = nstring.length();
                    int i = 0;
                    while (i < nlength) {
                        // If a match for the old substring is found
                        if (i + olength <= nlength && nstring.substring(i, i + olength).equals(OldWord)) {
                            result += newWord; // Append the new substring to the result
                            i += olength; // Skip ahead by the length of the old substring
                        } else {
                            result += nstring.charAt(i); // Append the current character to the result
                            i++; // Move to the next character
                        }
                    }
                    System.out.println("String after replacing substring: " + result);
                    break;
                    case 6: 
                    System.out.println("Enter the String: ");
                    // Check capacity, ensure Capacity from String Buffer Class
                    String mmm = cin.nextLine();
                     
                    
                     break ;
                      
                default:
                    System.out.println("\n You chose the wrong number");
                    break;
            }

            System.out.println("\nDo you want to continue? Press y or Y");
            ch = cin.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
    }
}

// import java.util.Scanner;

// public class AllString {

// public static void main(String[] args) {
// Scanner cin = new Scanner(System.in);

// char ch;
// do {
// System.out.println("1) Reversing the String: ");
// System.out.println("2) Inserting the Charaters ");
// System.out.println("3) Appending the String ");
// System.out.println("4) Deleting the Charater from string ");
// System.out.println("5) Replace a SubString ");
// System.out.println("6)Chech capacity, ensure Capacity from String Buffer
// Class");
// System.out.println("7)Demostate chainging the method by using String
// Buffer");

// System.out.println("\n\n \n Enter the your choice:");
// int choice = cin.nextInt();
// switch (choice) {
// case 1:

// System.out.println("Enter the String: ");
// String name = cin.nextLine(); // Now
// System.out.println("Revers the String:");
// System.out.println("Your String is: " + name);
// int le = name.length();
// char[] h = new char[le];
// for (int i = 0; i < le; i++) {
// h[i] = name.charAt(i);
// }
// int start = 0;
// int end = le - 1;
// for (int i = 0; i < le / 2; i++) {
// char s = h[start];
// char e = h[end];
// h[start] = e;
// h[end] = s;
// start++;
// end--;

// }
// name = new String(h);// store the charaters in the string :
// System.out.println("Converted by Revers : " + name);

// break;

// case 2:
// System.out.println("Enter the String: ");
// String Name = cin.nextLine(); // Fixed input for this case tooa
// cin.nextInt();
// // System.out.println("\n 2) Inserting the Charaters ");
// System.out.println("\nShow the String: " + Name);

// System.out.println("Enter the Charater : ");
// char ad = cin.next().charAt(0);

// System.out.println("Enter the Position in the String where you Strore the
// Charaters: ");
// int Pos = cin.nextInt();

// int l = Name.length();

// char addChar[] = new char[l + 1];
// char Original[] = Name.toCharArray();

// for (int i = 0; i < Pos; i++) {
// addChar[i] = Original[i];// store the FirstChar Array to Oringinal array :

// }
// addChar[Pos] = ad;// later store the position the array:

// // for (int i = name.length(); i >= Pos; i--)
// // {
// // if (i == Pos) {
// // addChar[i] = ad;
// // }
// // addChar[i] = addChar[-i];
// // }

// // for (int i = Pos; i < l; i++)
// // { // esay method use the
// // addChar[i + 1] = name.charAt(i);// very Easy use the methods :
// // }

// for (int i = Pos; i < l; i++) {
// addChar[i + 1] = Original[i];
// }

// Name = new String(addChar);

// System.out.println("Add the Char in the String: " + Name);

// break;

// case 3:
// System.out.println("Appending the String ");

// System.out.println("Enter the First String:; ");
// String First = cin.next();
// char fi[] = First.toCharArray();
// System.out.println("Enter the Second String: ");
// String Second = cin.next();
// char se[] = Second.toCharArray();

// int toLen = First.length() + Second.length();

// char addAll[] = new char[toLen + 1];

// int k = 0;
// for (int i = 0; i < First.length(); i++) {
// addAll[k] = fi[i];
// k++;
// }

// addAll[k] = ' ';
// k++;
// for (int j = 0; j < Second.length(); j++) {
// addAll[k] = se[j];
// k++;
// }
// String NavinTayarkeli = new String(addAll);

// System.out.println("Show the Adding the Two String: " + NavinTayarkeli);

// break;

// case 4:
// System.out.println("Enter the String: ");
// // name = cin.nextLine();
// String Deletring = cin.nextLine();
// char de[] = Deletring.toCharArray();
// System.out.println("Deleting the charater from String: ");

// System.out.println("Show the String: " + Deletring);
// System.out.println("which charater deleting input here: ");
// char Chde = cin.next().charAt(0);

// for (int i = 0; i < Deletring.length(); i++) {
// if (de[i] == Chde) {
// de[i] = ' ';
// }
// }
// Deletring = new String(de);
// System.out.println("Show the String after Deleting the Charater in String: "
// + Deletring);
// break;

// default:
// System.out.println("\n You choice the Wrong the nubers");
// break;
// }
// System.out.println("\n do you want continue so press y or Y");
// ch = cin.next().charAt(0);

// } while (ch == 'y' || ch == 'Y');
// }

// }
