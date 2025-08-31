import java.io.*;

class Create_file {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\HP\\Desktop\\Mangesh_FileHandling");

        boolean check = f.mkdirs();
        if (check) {
            System.out.println(" File is Create .....");

        } else {
            System.out.println("File is alredy created...");
            System.out.println("File Name: " + f.getName());
            System.out.println("file path.............." + f.getParentFile());

        }

    }
}