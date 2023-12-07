import java.io.*;

public class FileCreation {

    public static void main(String[] args) {
        File file = new File("E:\\JAVA\\Java File Generates\\2st.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Created...");
            } else {
                System.out.println("File Already Exist...");
            }
        } catch (IOException e) {
            System.out.println("Something Wrong Pls Check Your Statements...");
        }
    }
}