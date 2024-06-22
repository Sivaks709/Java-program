import java.io.File;

public class Fetch_FilesAndFolder {

    public static void main(String[] args) {
        File file = new File("E:\\JAVA\\File_handling");
        File list[] = file.listFiles();
        for (File file2 : list) {
            if (file2.isFile()) {
                String laststring=file2.getName().substring(file2.getName().lastIndexOf("."));
                if (laststring.equalsIgnoreCase(".jAva")) {
                    if (file2.length()>560) 
                        System.out.println(file2.getName());
                }
            }
        }
    }
}