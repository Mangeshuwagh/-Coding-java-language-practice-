// import java.util.*;
// import java.io.*;

// public class tp {

//     public static Scanner cin = new Scanner(System.in);

//     /**
//      * @param args
//      * @throws IOException
//      */
//     public static void main(String[] args) throws IOException {

//         // System.out.println(" you have new folder ");
//         File f = new File("D:\\NewFILE");
//         if (!f.exists()) {

//             if (f.mkdir()) {
//                 System.out.println(" file is Created ");
//             } else {
//                 System.out.println(" file is not create: ");
//                 return;
//             }

//         } else {
//             char ch = '0';

//             System.out.println("Folder is alredy exits  ");

//             do {
//                 System.out.println("1) you want the Create the Text File  new ");
//                 System.out.println("2) you want the write the File ");
//                 System.out.println("3) you want the Read the File ");
//                 System.out.println("4) you want the Countiune so press the C orther wise any prress ke you extits ");
//                 System.out.println(" enter the your choice ");
//                 int choice = 0;
//                 try {

//                     choice = cin.nextInt();
//                 } catch (InputMismatchException e) {
//                     // TODO: handle exception
//                     System.out.println(e);
//                     // cin.nextLine();
//                     continue;
//                 }

//                 switch (choice) {
//                     case 1:
//                         CretateTextFile();

//                         break;
//                     case 2:
//                         Wrtinfile();

//                         break;

//                     default:
//                         System.out.println(" you Press the Wrong the keyword ");
//                         break;
//                 }
//                 System.out.println(" you Want the conutine  so smalll c ");
//                 ch = cin.nextLine().charAt(0);
//                 // cin.nextLine();

//             } while (ch == 'c');

//         }

//     }

//     public static void CretateTextFile() throws IOException {

//         System.out.println("Enter the File name in text ");
//         cin.nextLine();
//         String filenmaetext = cin.nextLine();
//        File doc = new File("D:\\NewFILE\\" + filenmaetext);
//         if (!doc.exists()) {

//             if (doc.createNewFile()) {

//                 System.out.println(" Text File is Creted ");
//             } else {
//                 System.out.println(" text file is not Created ");
//                 return;
//             }
//         } else {
//             System.out.println(" File alredy exits ");
//         }
//         return;
//     }

//     public static void Wrtinfile() {

//         System.out.println(" Enter the data in text file you want the write a data ");
//         String writte = cin.nextLine();

//         OutputStream doc;
//                 BufferedWriter write = new BufferedWriter(new FileWriter(doc,wr));

//     }
// }
