// Q5. WAP to store 10 string objects in ArrayList and perform the following operation on it.
// Case 1: Add String data 
// Case 2: Search string ends with sh 
// Case 3: Search string start with r
// Case 4: Count the number of word in every string 
// Case 5: Reverse the every word of string from ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class StringPrg {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        char ch;

        ArrayList<String> arStr = new ArrayList<>();

        do {
            System.out.println("1: Add String data \r\n" + //
                    "// Case 2: Search string ends with sh \r\n" + //
                    "// Case 3: Search string start with r\r\n" + //
                    "// Case 4: Count the number of word in every string \r\n" + //
                    "// Case 5: Reverse the every word of string from ArrayList");
            int choice = cin.nextInt();
            switch (choice) {
                case 1:

                    if (arStr.size() >= 10) {
                        System.out.println(" you can store a only 10 string ");

                    } else {

                        System.out.println(" enter the String ");
                        String writeSome = cin.nextLine();
                        arStr.add(writeSome);
                        System.out.println("Added Succefully the String in the Array");
                    }
                    break;
                case 2:
                    System.out.println("Search string ends with sh \\r\\n" + //
                            " ");
                    for (String str : arStr) {
                        if (str.endsWith("sh")) {
                            System.out.println(str);
                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println(" Search String Start for  r ");
                    for (String strr : arStr) {

                        if (strr.startsWith("r")) {
                            System.out.println(strr);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Count the numbers of Strings ");
                    for (String sttr : arStr) {

                        String strrr[] = sttr.trim().split("\\s");
                        System.out.println(sttr + "  lenght of " + strrr.length);

                    }

                    break;
                    case 5:
                    System.out.println( " Show the Revers the all the Strings ");
                    for(String revStr : arStr)
                    {
                        String reversString[] = revStr.trim().split("\\s");
                        StringBuilder revssline = new StringBuilder();
                        for(String word :reversString )
                        {
                             StringBuilder sb = new StringBuilder();
                             revssline.append(sb.reverse().toString()).append(" ");
                        }
                        System.out.println("Original "+revStr);
                        System.out.println("Revers String "+revssline.toString().trim());
                    }
                    break ;

                default:
                System.out.println(" You Choice the Wrong ");
                    break;

            }

            System.out.println(" u want the continue so press c ");
            ch = cin.next().charAt(0);
        } while (ch == 'c');
    }

}
