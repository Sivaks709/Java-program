class test5
{
    int a=10;
    static test5 ref=new test5();

    test5()
    {
        System.out.println("J 4 Jock I Told A Alaa");
    }
    public void demo1()
    {
        System.out.println("Hi I Am Demo");    
    }
    static
    {
        ref.demo1();
    }

    {
        System.out.println("Hi I Am Non Static Multi Line Initializer");
    }

    public static void main(String[] args) {
        System.out.println(ref.a);
        System.out.println("BYE");
    }
}
