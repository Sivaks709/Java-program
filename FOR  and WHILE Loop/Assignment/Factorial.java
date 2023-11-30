import java.util.*;
class factorial
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number");
        int n=s.nextInt();
        int temp=n;
        while(n>1)
        {
            n-=1;
            temp*=n;
        }
        System.out.println(n+" factorial is "+temp);
    }
}