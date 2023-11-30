class test6
{
    static int a=15;
    static test6 t=new test6();
    public static void main(String[] args)
    {
        t.demo();
    }
    public void demo()
    {
        System.out.println(a);
        System.out.println(test6.a);
        System.out.println(t.a);
    }
    {
        System.out.println("Hi I am Test 6");
    }
}
