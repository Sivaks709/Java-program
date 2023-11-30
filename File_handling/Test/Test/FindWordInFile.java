package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindWordInFile {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\JAVA\\File_handling\\Test\\Test\\String_for_Kathir\\input.txt");
        if (file.exists()) {
            BufferedReader befferedReader = new BufferedReader(new FileReader(file));
            int count = 0;
            String f_Word = "in", lineReader;
            while ((lineReader = befferedReader.readLine()) != null) {
                String words[] = lineReader.split(" ");
                for (String word : words) {
                    if (word.equals(f_Word)) count++;
                }
            }
            System.out.println(count);
            befferedReader.close();
        } else {
            System.out.println("File Not Found...");
        }
    }
}