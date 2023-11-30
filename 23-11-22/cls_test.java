class cls_test
{
    public static void m1()
    {
        System.out.println("JAVA");
    }
}
class cls extends cls_test
{
    public static void m1()
    {
        System.out.println("PYTHON");
    }
    public static void main(String[] args)
    {
        cls_test.m1();
        cls_test m=new cls();
        m.m1();
        cls.m1();
    }
}
