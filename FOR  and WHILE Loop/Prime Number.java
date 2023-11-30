import java.util.*;
class priNum
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=s.nextInt();
        int res=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                res++;
            }
        }
        if(res==2)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }
}