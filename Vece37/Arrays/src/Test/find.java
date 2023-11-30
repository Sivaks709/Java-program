package Test;
import java.util.*;
/**
 * find
 */
public class find {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args)
    {
        int a[]={1,2,3,2,5,4,8,6,4,7,2,3,7};
        System.out.print("Enter The Value : ");
        int key=s.nextInt();
        System.out.println(Search1(a, key));
    }
    public static String Search1(int a[],int key)
    { 
        String s1="Not Present";
        int count=0;
        for (int i = 0; i < a.length; i++) 
        {
            if (key==a[i])
            {
                s1="Present";
                count+=1;
            }
        }
        return key+" "+s1+" "+count+" Times";
    }
}