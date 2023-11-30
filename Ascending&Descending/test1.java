public class test1
{
    public static void main(String[] args)
    {
        int n[]={5,8,7,3,2,4,6,9};
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        for (int i = 0; i < n.length; i++)
        {
            if (n[i]%2==0)
            {
                n[i]=0;
            }
            else
            {
                n[i]=n[i];
            }
        }
        System.out.println();
        for (int i = 0; i < n.length; i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}

