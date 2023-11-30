package Test;
import java.util.*;

public class StrongNum {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : "); // 145
        int num=s.nextInt(),temp=num,last,sum=0;
        while (num>0) {
            int fact=1;
            last=num%10;
            for (int i = 1; i <= last; i++) {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if (sum==temp) {
            System.out.println(temp+" IS STRONG NUMBER...");
        } else {
            System.out.println(temp+" NOT IS STRONG NUMBER...");
        }
    }
}
