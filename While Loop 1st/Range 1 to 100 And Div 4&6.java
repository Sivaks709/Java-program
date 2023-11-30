class div_4_to_6
{
    public static void main(String[] args)
    {
        int n=1;
        while (n<=100)
        {
            if ((n%2==0)||(n%4==0))
            {
                System.out.println(n);
            }
            n++;
        }
    }
}