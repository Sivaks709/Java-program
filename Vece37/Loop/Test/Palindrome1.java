package Test;

import java.util.*;
public class Palindrome1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : ");
        int n=s.nextInt(),t=n,res=0;
        while (n>0) {
            res=res*10+(n%10);
            n/=10;
        }
        if (t==res) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
