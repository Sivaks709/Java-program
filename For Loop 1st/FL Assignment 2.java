import java.util.*;
class div1
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }    
}