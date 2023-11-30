class test4
{
    static int a= 10; // STATIC VARIABLE
    static test4 t=new test4();

    test4() // CONSTRCTOR
    {
        // LOAD INST
    }

    public static void demo() //STSTIC METHOD
    {
        System.out.println("HI I AM DEMO....");
    }

    static //STATIC MULTI LINE INITIALIZER
    {
        System.out.println(a);
        System.out.println(test4.a);
        System.out.println(t.a);
    }

    public static void main(String[] args)
    {
        demo();
        test4.demo();
        t.demo();
    }
}
