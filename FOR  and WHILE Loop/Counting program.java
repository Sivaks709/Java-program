import java.util.*;
class counting
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        int n=s.nextInt();
        int temp=n;
        int res=0;
        while(n>0)
        {
            n=n/10;
            res++;
        }
        System.out.println("The Digit Of "+temp+" is " +res);
    }
}