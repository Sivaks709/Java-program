class a01
{
    public static void main(String[] args)
    {
        for(int i=56,m=10;i<=72;i++,m--)
        {
            System.out.println((char)i+"-->"+m);
            if(m<=7)
            {
                m=11;
            }
        }
    }
}