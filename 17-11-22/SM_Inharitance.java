class A
{
    static
    {
        System.out.println("Hi I Am Multi Line Initializer ---> A");
    }
    public static void m1()
    {
        System.out.println("Hi I Am >>>> M1");
    }
}
class B extends A
{
    static
    {
        System.out.println("Hi I Am Multi Line Initializer ---> B");
    }
    public static void m2()
    {
        System.out.println("Hi I Am >>>> M2");
    }
}
class C extends B
{
    static
    {
        System.out.println("Hi I Am Multi Line Initializer ---> C");
    }
    public static void m3()
    {
        System.out.println("Hi I Am >>>> M3");
    }
    public static void main(String[] args)
    {
        m1();
        m2();
        m3();
    }
}