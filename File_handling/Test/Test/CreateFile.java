package Test;
import java.io.*;
import java.util.*;
// E:\\JAVA\\Java File Generates\\Create_Mode.txt

public class CreateFile {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Path : ");
        File file = new File(s.nextLine());
        if (file.createNewFile()) {
            System.out.println("File Is Created...");
        }

        System.out.print("Enter The Path : ");
        File filee = new File(s.nextLine());
        System.out.println(filee.delete());
    }
}