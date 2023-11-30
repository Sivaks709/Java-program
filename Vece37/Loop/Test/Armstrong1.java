package Test;

import java.util.*;
public class Armstrong1 {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),t=n,s=0,p=1,l=0,c=0;
        while (n>0) {
            n/=10;
            c++;
        }
        n=t;
        while (n>0) {
            l=n%10;
            p=1;
            for (int i = 1; i <= c; i++) {
                p*=l;
            }
            s+=p;
            n/=10;
        }
        if (t==s) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }    
}