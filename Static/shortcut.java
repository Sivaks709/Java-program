class shortcut
{
    public static void main(String[] args)
    {
        System.out.println(m1(4,false));
        if (m2(4,6))
        {
            System.out.println(m1(8,false));
        }
        System.out.println("bye");
    }

    public static String m1(int a,boolean b)
    {
        String s="JBDC";
        if (m2(4,4))
        {
            System.out.println("hi i am m1");
        }
        return s;
    }
    public static boolean m2(double a,double b)
    {
        if(a==b)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
