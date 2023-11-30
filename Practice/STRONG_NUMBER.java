import java.util.Scanner;

/**
 * STRONG_NUMBER
 */
public class STRONG_NUMBER {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter value"); // Of 145
        int n=s.nextInt(),sum=0,fact=1,last=0,temp=n;
        while (n>0) {
            last=n%10;
            fact=1;
            for (int i = 1; i <= last; i++) {
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if (temp==sum) {
            System.out.println("strong number");
        } else {
            System.out.println("not strong number");
        }
    }
}