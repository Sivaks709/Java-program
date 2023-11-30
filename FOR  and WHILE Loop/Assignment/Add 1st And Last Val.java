import java.util.*;
class Add_1st_End
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number");    
        int n=s.nextInt();
        int res=n%10;
        int res1=n;
        while(res1>=10)
        {
            res1/=10;
        }
        System.out.println(res+res1);
        
    }
}