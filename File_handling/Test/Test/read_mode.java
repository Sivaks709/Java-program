package Test;
import java.io.*;
import java.util.*;

public class read_mode {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Enter The Path : ");
        File file = new File(scanner.nextLine());
        InputStream fr = new FileInputStream(file);
        int display = fr.read();
        while (display != -1) {
            System.out.print((char)display);
            display =fr.read();
        }
        fr.close();
    }
}