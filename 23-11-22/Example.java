class Example
{
    public static void m1()
    {
        System.out.println("java");
    }
}
class Example1 extends Example
{
    public static void m1()
    {
        System.out.println("python");
    }
}
class Example2 extends Example1
{
    public static void m1()
    {
        System.out.println(".NET");
    }
}
class Example3 extends Example2
{
    public static void m1()
    {
        System.out.println("java script");
    }
}
class Example4 extends Example3
{
    public static void m1()
    {
        System.out.println("html & css");
    }

    public static void main(String[] args)
    {
        Example m=new Example4();
        m.m1();
        Example3.m1();
    }
}


