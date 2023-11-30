import java.util.*;
class tab1
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter N Value");
        int n=s.nextInt();
        System.out.println("Enter m Value");
        int m=s.nextInt();
        int k=1;
        while(n<=m)
        {
            System.out.println(n+"*"+k+"="+n*k);
            n++;
            k++;
        }
    }
}