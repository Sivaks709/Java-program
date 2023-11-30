import java.io.*;
import java.util.Scanner;

public class Write_Data_Into_File {
    
    static Scanner s=new Scanner(System.in);
    static OutputStream fw;
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Path : ");
        File file=new File(s.nextLine());
        fw=new FileOutputStream(file);
        System.out.print("Enter The Data : ");
        String data=s.nextLine();
        fw.write(data.getBytes());
        System.out.println("Done...");
        fw.close();
    }
}
