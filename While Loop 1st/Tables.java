import java.util.*;
class t1
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter N Value");
        int n=s.nextInt();
        System.out.println("Enter M Value");
        int m=s.nextInt();
        int k=1;
        do
        {
            System.out.println(n+"*"+k+"="+k*n);
            k++;
            if (k==11)
            {
                k=1;
                n++;
                System.out.println("_______________________________");
            }    
        }while(n<=m);
    }
}