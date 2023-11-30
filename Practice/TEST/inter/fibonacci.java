package TEST.inter;

import java.util.Scanner;

public class fibonacci {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n1=0,n2=1,res=0,n=s.nextInt();
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i < n ; i++) {
            res=n2+n1;
            System.out.print(res+" ");
            n1=n2;
            n2=res;
        }
    }
}
