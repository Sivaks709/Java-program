import java.util.*;
/**
 * PALINDROME
 */
public class PALINDROME {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),temp=n,res=0;
        while (n>0) {
            res=res*10+(n%10);
            n/=10;
        }
        if (res==temp) {
            System.out.println(temp+" IS PALINDROME...");
        } else {
            System.out.println(temp+" NOT IS PALINDROME...");
        }
    }
}