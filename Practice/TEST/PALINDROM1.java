package TEST;

import java.util.Scanner;

public class PALINDROM1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : ");
        int n=s.nextInt(),res=0,temp=n;
       while (n>0) {
            res=res*10+(n%10);
            n/=10;
       }
        if (res==temp) {
            System.out.println("Armstron");
        } else {
            System.out.println("Not Armstron");
        }
    }
}
