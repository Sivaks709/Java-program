import java.util.*;
class fact
{
    static Scanner s=new Scanner(System.in);
    static int fact=1,count;
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        int n=s.nextInt();
        count=n;
        System.out.println(factorial(n));
    }
    public static int factorial(int n)
    {
        if(count!=0)
        {
            fact*=n;
            n--;
            count--;
            factorial(n);
        }
        return fact;
    }
}
