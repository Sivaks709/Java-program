package Test;
import java.util.*;

public class First_And_Last_Sum {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : ");
        int n=s.nextInt();
        int l=n%10;
        while (n>9) {
            n/=10;
        }
        int tot=n+l;
        System.out.println(tot);
    }
}
