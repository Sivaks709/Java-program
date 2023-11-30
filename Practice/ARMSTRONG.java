import java.util.Scanner;

public class ARMSTRONG {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),temp=n,count=0,last=0,product=1,sum=0;
        while (n>0)
        {
            n/=10;
            count++;
        }
        n=temp;
        while (n>0)
        {
            last=n%10;// 3 153 5 15 1
            product=1;
            for (int i = 1; i <= count; i++)
            {
                product*=last;
            }
            sum+=product;
            n/=10;// 15 0
        }
        System.out.println(sum==temp?temp+" : IS ARMSTRONG":temp+" : IS NOT ARMSTRONG");
    }
}