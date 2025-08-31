import java.util.Scanner;
import java.io.*;

public class Buffering {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        File folder = new File("D:\\Java program  all\\File Handling\\Mangesh");

        boolean checkFolder = folder.exists();
        if (checkFolder) {
            System.out.println("You alredy Created the Folder so....");
            System.out.println("You want Read the file inside document whats write a user so wirte : R ");
            char read = cin.nextLine().charAt(0);
            if (read == 'R') {

                FileReader fr = new FileReader("D:\\Java program  all\\File Handling\\Textwrite.txt");
                BufferedReader br = new BufferedReader(fr);
                String ReadData;
                while ((ReadData = br.readLine()) != null) {
                    System.out.println(ReadData);
                    // Thread.sleep(1000);

                }
                br.close();
                fr.close();

            } else {
                System.out.println("Exits the Program Succesfully...................");
            }
        } else {
            boolean folderCreated = folder.mkdirs();

            if (folderCreated) {

                System.out.println("Folder inside created one documents......\n ");
                FileWriter fw = new FileWriter("D:\\Java program  all\\File Handling\\Textwrite.txt", true);

                System.out.println("How many time you Read the line in Documents:. ..   . . . .. ");
                int ntime = cin.nextInt();
                BufferedWriter bw = new BufferedWriter(fw);
                String data;
                for (int i = 0; i <= ntime; i++) {

                    System.out.println("Enter the " + i + "Line..");
                    data = cin.nextLine();

                    bw.write(data);
                    bw.newLine();

                }
                bw.close();
                fw.close();
                System.out.println("Data successfully stored..................");
            } else {
                System.out.println(
                        "Folder is not Created you check the in program path or mkdirs() method you use or not: ");
            }
        }

    }

}
