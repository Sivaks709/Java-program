import java.util.*;
public class Array3
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        
        System.out.print("Enter Array Size :");
        int a []=new int[s.nextInt()];
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("a"+"["+i+"]"+" --> Enter Value : ");
            a[i]=s.nextInt();
        }
        System.out.println("***************************");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
