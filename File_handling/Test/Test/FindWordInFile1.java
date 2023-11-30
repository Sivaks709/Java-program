package Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindWordInFile1 {

    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read the text file
        BufferedReader reader = new BufferedReader(new FileReader("E:\\JAVA\\File_handling\\Test\\Test\\String_for_Kathir\\input.txt"));

        // Initialize the word to find
        String wordToFind = "line";
        int count=0;

        // Read all the lines of the text file one by one
        String line;
        while ((line = reader.readLine()) != null) {
            // Check if the word is found in the current line
            if (line.contains(wordToFind)) {
                // Print the line that contains the word
               count++;
            }
        }

        System.out.println(count);
        // Close the BufferedReader object
        reader.close();
    }
}