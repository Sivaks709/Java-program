package TEST;

import java.util.Scanner;

public class strong1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : "); // 145
        int n=s.nextInt(),last=0,fact=1,sum=0;
        while (n>0) {
            last=n%10;
            fact=1;
            for (int i = 1; i <= last; i++) {
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        System.out.println(sum);
    }
}
