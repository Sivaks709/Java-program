import java.util.Scanner;

/**
 * PERFACT_NUMBER
 */
public class PERFACT_NUMBER {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : "); // 28
        int n=s.nextInt(),sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        if (sum==n) {
            System.out.println(n+" : PERFACT NUMBER...");
        }
        else
        {
            System.out.println(n+" : not PERFACT NUMBER...");
        }
    }
}