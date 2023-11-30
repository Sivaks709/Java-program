class reverse
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int [a.length];
        for (int i = 0,m=a.length-1; i < b.length; i++,m--)
        {
            b[i]=a[m];
        }
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}