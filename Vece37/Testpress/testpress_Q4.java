import java.util.*;
public class testpress_Q4 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),rev=0;
        while (n>0) {
            int m=n%10;
            if (m==0) {
                n/=10;
            }
            else
            {
                rev=rev*10+m;
                n/=10;
            }
        }
        System.out.println(rev);
    }
}
