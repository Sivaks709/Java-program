package Test;
import java.util.Scanner;
public class Find_Mid_Value
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        int a[]={1,2,4,5,6};
        System.out.print("Enter Value : ");
        int key=s.nextInt();
        int low=0,hig=a.length-1,mid=(hig+low)/2;
        if (key==a[mid])
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }
    }
}