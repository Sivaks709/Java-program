import java.util.*;
class oddNum
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter N range");
        int n=s.nextInt();
        System.out.println("Enter M range");
        int m=s.nextInt();
        while(n<=m)
        {
            if (n%2==1)
            {
                System.out.println(n);
            }
            n++;
        }
    }
}