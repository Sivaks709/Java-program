import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write_Content {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\JAVA\\File_handling\\Test\\Test\\String_for_Kathir\\input.txt");
        System.out.println("Enter The Content :");
        String data = scanner.nextLine();
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(data.getBytes());
        FileInputStream fi = new FileInputStream(file);
        int num = fi.read();
        while (num!=-1) {
            System.out.print((char)num);
            num=fi.read();
        }
        fi.close();
        fo.close();
    }
}
