import java.io.*;
import java.util.Scanner;

public class Read_Data_From_File {
    
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Path : ");
        File file = new File(s.nextLine());
        InputStream fr=new FileInputStream(file);
        int res=fr.read();
        while (res!=-1) {
            System.out.print((char)res);
            res=fr.read();
        }
        fr.close();
        System.out.print("\nDone...");
    }
}
