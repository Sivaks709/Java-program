package TEST.inter;
import java.util.*;
public class amstrong {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        for (int i = 1000; i <= n; i++) {
            int num=i,temp=i,count=0,sum=0;
            while (num>0) {
                count++;
                num/=10;
            }
            num=temp;
            while (num>0) {
                int last=num%10;
                int fact=1;
                for (int j = 1; j <= count; j++) {
                    fact*=last;
                }
                sum+=fact;
                num/=10;
            }
            if (sum==temp) {
                System.out.println(temp+" Amstron..");
            }
        }
    }
}