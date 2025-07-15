
import java.io.*;
import java.util.*;
// यह तब इस्तेमाल होता है जब कोई resource (जैसे FileReader, BufferedReader, Scanner, Connection, etc.) को हम open करते हैं और उसे बाद में close भी करना होता है।

// Try-with-resources में, जो भी resource आप () में declare करते हो, वो try block के ख़त्म होते ही automatically close हो जाता है।
// ➤ यानी हमें .close() manually लिखने की जरूरत नहीं

public class try_with_Resource {

    public static void main(String[] args) {

        // D:\DataWriter_useCode
        File flr = new File("D:\\DataWriter_useCode\\Something.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(flr))) {

            String Readdd = br.readLine();
            System.out.println(Readdd);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
