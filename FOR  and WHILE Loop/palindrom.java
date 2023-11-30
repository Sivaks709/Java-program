import java.util.*;
class palindrom
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=s.nextInt();
        int temp=n; 
        int res=0;
        while(n>0)
        {
            int a=n%10; 
            res=res*10+a; 
            n=n/10; 
        }
        if(res==temp)
        {
            System.out.println(res+" Is Palindrom");
        }
        else
        {
            System.out.println(res+" Not Is Palindrom");
        }

   }
}