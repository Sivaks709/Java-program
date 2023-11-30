import java.util.*;
class reverse
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number"); 
        int n=s.nextInt();
        int res=0;
        while(n>0)
        {
            res=res*10+(n%10);
            n/=10;
        }
        System.out.println(res);
    }
}