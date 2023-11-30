import java.util.Scanner;

public class reverse_Str {

    public static void main(String[] args) {
        System.out.print("Enter The String : ");
        String s=new Scanner(System.in).nextLine().toLowerCase();
        if (s.length()<=100) {
            for (int i = s.length()-1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
        }
    }
}