import java.util.Scanner;

public class PRIME_NUMBER {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        if (n==0||n==1)
        {
            System.out.println("SORRY TRY AGIN ----> [0 AND 1 IS NOT CORRECT INPUT...]");
        }
        else
        {
            int count=0;
            for (int i = 1; i <= n; i++) {
                if (n%i==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(n+" : IS PRIME NUMBER...");
            } else {
                System.out.println(n+" : IS NOT PRIME NUMBER...");
            }
        }
    }
}
