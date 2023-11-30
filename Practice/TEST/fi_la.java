package TEST;

import java.util.Scanner;

public class fi_la {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),Last=n%10,sum=0;
        while (n>9) {
            n/=10;
        }
        sum=n+Last;
        System.out.println(sum);
    }
}
