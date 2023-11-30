import java.util.*;
class Sum_Even_NUm
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number");        
        int n=s.nextInt();
        int res=0;
        int temp=0;
        while(n>0)
        {
            res=n%10;
            n/=10;
            if(res%2==0)
                temp+=res;
        }
        System.out.println(temp);
    }
}