import java.util.*;
class Xylem_Number
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        int n=s.nextInt(),last=0,sum=0,first=0;
        last=n%10;
        n/=10;
        while (n>9) {
            sum+=n%10;
            n/=10;
        }
        first=n+last;
        System.out.println(first==sum);
    }
}