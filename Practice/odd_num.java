import java.util.Scanner;

public class odd_num {
    static Scanner foo = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter num : ");
        int n=foo.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }
    }
}
