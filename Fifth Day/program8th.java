import java.util.*;
import java.io.*;

// Q8. WAP to read file using BufferedReader and count its number of word in file, count number of
// character in file and count vowels and consent from file?
public class program8th {

    public static void main(String[] args) throws IOException {

        File fl = new File("C:\\Users\\HP\\Desktop\\Data Reader\\DataReader.txt");
        // BufferedReader br = fl.BufferedReader(new FileReader("DataReader"));
        BufferedReader br = new BufferedReader(new FileReader(fl));

        int CountVovels = 0;
        int CounttheNumberofChar = 0;
        String line = br.readLine();
        int countWord = 0;
        while (line != null) {
            String str[] = line.split("\\s+");

            countWord += str.length;
            int start = 0;

            while (start != str.length) {
                char ch[] = str[start].toCharArray();
                CounttheNumberofChar += ch.length;
                for (int j = 0; j < ch.length; j++) {
                    if ((ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u')
                            || (ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'O' || ch[j] == 'U' || ch[j] == 'I')) {
                        CountVovels++;
                        System.out.print(ch[j] + " ");
                    }

                }
                start++;
            }
            line = br.readLine();

        }
        System.out.println("\nTotal Vowels: " + CountVovels);
        System.out.println("Total Words: " + countWord);
        System.out.println("Total Characters: " + CounttheNumberofChar);
        // File fl2 = new File()
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader(fl));

        String readFullLine = br2.readLine();
        System.out.println("\nFull lines we read:");
        while (readFullLine != null) {
            System.out.println(readFullLine);
            readFullLine = br2.readLine();
        }

        br2.close();

    }

}
