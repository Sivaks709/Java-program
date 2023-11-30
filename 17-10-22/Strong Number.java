import java.util.*;
class Strong_Num
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        String msg=("ENTER NUMBER...");
        System.out.println(msg);
        int n=s.nextInt();
        int temp=n,res=0,last=0,fact=1;
        while (n>0)
        {
            last=n%10;
            fact=1;
            for (int i = 1; i <= last; i++)
            {
                fact*=i;
            }
            res+=fact;
            n/=10;
        }
        if (res==temp)
        {
            System.out.println(res+" Is Strong Number...");
        }
        else
        {
            System.out.println(res+" Is Not Strong Number...");
        }
    }
}