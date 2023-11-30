package Test;
import java.io.*;
import java.util.*;

public class WriteFile {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Path : ");
        File file = new File(s.nextLine());
        OutputStream fw=new FileOutputStream(file);
        System.out.print("Enter The Data : ");
        String data=s.nextLine();
        fw.write(data.getBytes());
        System.out.println("Done...");
        fw.close();
    }
}  