package Test;

public class Advance_find
{
    public static void main(String[] args)
    {
        int a[]={1,1,2,2,3,2,3,8,5,4,9,7};
        // int count=0;
        for (int i = 0; i < a.length; i++)
        {
            int count=0;
            for (int j = i+1; j < a.length; j++)
            {
                if (a[i]==a[j]&&a[j]!=-38)
                {
                    count++;
                    a[j]=-38;
                }
            }
            if(count>0)
            {
                System.out.println("The duplicate element is : "+count+" : "+a[i]);
            }		
        }
    }
}
