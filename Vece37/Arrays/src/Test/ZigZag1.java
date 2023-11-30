package Test;
public class ZigZag1
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int res[]=new int[a.length+b.length];
        for (int i = 0,m=0,n=0; i < res.length; i++)
        {
            if (i%2==0)
            {
                res[i]=a[m++];
            }
            else
            {
                res[i]=b[n++];
            }
            System.out.print(res[i]+" ");
        }
    }
}
