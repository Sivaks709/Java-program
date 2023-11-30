import java.util.*;
class perfect
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is Perfect Number of "+sum);
        }
        else{
            System.out.println(n+" is Not Perfect Number of "+sum);
        }
    }
}
