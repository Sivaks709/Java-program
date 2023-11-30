package Test;
import java.util.*;
public class Perfact1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String [] a) 
    {
        System.out.print("Enter Value : "); // 28
        int num=s.nextInt(),sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                sum=sum+i;
            }
        }
        if (num==sum) {
            System.out.println(num+" IS PERFACT NUMBER...");
        } else {
            System.out.println(num+" NOT IS PERFACT NUMBER...");
        }
    }        
}
