import java.util.Scanner;
class FL_MP_Tab
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter N Value");
        int n=s.nextInt();
        System.out.println("Enter m Value");
        int m=s.nextInt();
        for(int i=1;n<=m;i++)   
        {
            System.out.println(n+"*"+i+"="+n*i);
            if(i==10)
            {
                n++;
                i=0;
                System.out.println("**************");
            }
        }
    }
}