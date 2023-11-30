package TEST;
import java.util.Scanner;

public class merfantz {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Row Value : ");
        int num=s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}