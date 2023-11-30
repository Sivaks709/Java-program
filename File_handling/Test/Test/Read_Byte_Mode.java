package Test;
import java.util.*;
import java.io.*;

public class Read_Byte_Mode {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The path : ");
        File file = new File(s.nextLine());
        InputStream frb = new FileInputStream(file);
        byte[] data = frb.readAllBytes();
        for (byte b : data) {
            System.out.print((char)b);
        }
        frb.close();
    }
}
