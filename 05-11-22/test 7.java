class test7
{
    int a=15;
    static test7 t=new test7();
    public static void main(String[] args)
    {
        t.demo();
    }
    public void demo()
    {
        System.out.println(a);
        System.out.println(t.a);
    }
    {
        System.out.println("Hi I am Test 7");
    }
}

