public class test
{
    public static void main(String[] args)
    {
        int n[]={5,8,7,3,2,4,6};
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        for (int i = 0; i < n.length; i++)
        {
            if (n[i]%2==0)
            {
                n[i]=n[i]+1;
            }
            else
            {
                n[i]=n[i]-1;
            }
        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
