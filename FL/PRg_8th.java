
// Q8. WAP to read file using BufferedReader and count its number of word in file, count number of
// character in file and count vowels and consent from file?

import java.util.*;

import java.io.*;

public class PRg_8th {

    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner cin = new Scanner(System.in);
        File f = new File("D:\\Java program  all\\FL\\Mangesh\\TEXT.txt");
        if (!f.exists()) {
            if (f.createNewFile()) {
                System.out.println("file is cretead");
            } else {
                System.out.println(" file is not created ");
                return;
            }
        } else {

            System.out.println("alredy exitss ");
            // System.out.println("Enter the data u want write ");
            // String data = cin.nextLine();

            // BufferedWriter wr = new BufferedWriter(new FileWriter(f, true));

            // wr.write(data);
            // wr.newLine();

            // System.out.println(" data write a succefully..............");
            // wr.close();
            // return;
        }

        // System.out.println(" text file is created ");

        BufferedReader rd = new BufferedReader(new FileReader(f));
        int allcount = 0;
        String data;
        int WordCount = 0;
        int vovels = 0;
        int dt = 0;
        int anotherChar = 0;
        while ((data = rd.readLine()) != null) {
            System.out.print(data + " ");
            Thread.sleep(1500);

            WordCount += data.split("\\s+").length;

            char ch[] = data.toCharArray();
            for (char c : ch) {

                if (c >= 'a' && c <= 'z') {
                    // if ((c == 'a' && c == 'e' && c == 'i' && c == 'o' && c == 'u') || (c == 'A'
                    // && c == 'E' && c == 'I'
                    // && c == 'O' && c == 'U')) {
                    // vovels++;
                    // } else {
                    // anotherChar++;
                    // }
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        vovels++; // Count vowels
                    } else {
                        anotherChar++; // Count consonants
                    }

                }
                System.out.print(" " + c);
                allcount++;

            }
        }

        System.out.println(" Vovels " + vovels);
        System.err.println(" all charater " + allcount);
        System.out.println("Total Words " + WordCount);

        System.out.println(" another charaters " + anotherChar);
    }
}
