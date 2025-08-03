
// Q11. WAP to copy the image from D: drive and paste it on E drive?
import java.util.*;
import java.io.*;

public class program11th {

    public static void main(String[] args) throws IOException {
        File fl = new File("C:\\Mangesh Images\\MangeshImages.jpg");

        File fl2 = new File("D:\\ImageCopyUsingcode\\MangeshImages.jpg");

        FileInputStream fli = new FileInputStream(fl);
        FileInputStream flii = new FileInputStream(fl2);
        {

            byte[] buffer = new byte[1024];
            int bytesread;
            while ((bytesread = fli.read(buffer)) != -1) {
                fl2.write(buffer, 0, bytesread);

            }
        }

    }
}
