/**
 * Ascending
 */
public class Ascending {

    public static void main(String[] args)
    {
        int temp=0;
        int n[]={55,86,21,34,2,54,24,55};
        for (int i = 1; i <= n.length; i++)
        {
            for (int j = 0; j < n.length-1; j++)
            {
                if (n[j]>n[j+1])
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]+" ");
        }
    }
}