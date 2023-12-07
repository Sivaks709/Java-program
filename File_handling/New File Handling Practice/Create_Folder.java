import java.io.File;
import java.io.IOException;

public class Create_Folder {
    public static void main(String[] args) {
        File file = new File("E:\\JAVA\\File_handling\\Test\\Test\\String_for_Kathir\\Demo.txt");
        try {
            System.out.println(file.createNewFile()?"File Created...":"File Already Exist...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
