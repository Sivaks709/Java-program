import java.util.*;
import java.io.*;

public class Read_The_Data_In_ByteMode {
    
    static Scanner s = new Scanner(System.in);
    static InputStream fr;
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Data : ");
        File file = new File(s.nextLine());
        fr=new FileInputStream(file);
        byte res[]=fr.readAllBytes();
        for (int i = 0; i < res.length; i++) {
            System.out.print((char)res[i]);
        }
        fr.close();
        System.out.println("\nDone...");
    }
}
