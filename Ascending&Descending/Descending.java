public class Descending
{
    public static void main(String[] args)
    {
        int n[]={1,2,3,9,6,7,4,8,5};
        int temp=0;
        for (int i = 1; i <= n.length; i++)
        {
            for (int j = 0; j < n.length-1; j++)
            {
                if(n[j]<n[j+1])
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]+"");
        }
    }
}
