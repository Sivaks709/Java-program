package TEST;

import java.util.Scanner;

public class xylem {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : ");
        int n=s.nextInt();
        int last=n%10,sum=0;
        n/=10;
        while (n>9) {
            sum=sum+(n%10);
            n/=10;
        }
        int f=last+n;
        System.out.println(f+" "+sum);
    }
}
