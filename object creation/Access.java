class Access
{
    int a=111;
    static double b=15;
    public static void main(String[] args)
    {
        int a=20;
        System.out.println((char)b);
        System.out.println("Hi I Am Main");
        System.out.println(a);
        Access n=new Access();
        System.out.println(n.a);
        n.name1();
        Access.name2();
    }   
    public void name1()
    {   
        int b=70;
        System.out.println("Hi I Am Non Static Method");
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(Access.b); 
    }

    public static void name2()
    {
        System.out.println("Hi I Am Static Mathod");
        Access b1=new Access();
        System.out.println(b);
        System.out.println(b1.a);
    }

    static
    {
        System.out.println("Hi I Am Static");
        System.out.println((int)b);
        Access sta=new Access();
        System.out.println(sta.a);
    }
}