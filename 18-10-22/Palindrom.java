import java.util.*;
class Palindrom
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        String msg="Enter Number";
        System.out.println(msg);
        int n=s.nextInt();
        int temp=n,res=0;
        while (n>0)
        {
            res=res*10+(n%10);
            n/=10;
        }
        if (temp==res)
        {
            System.out.println("PALINDROM");
        }
        else
        {
            System.out.println("NOT PALINDROM");
        }

    }
    
}