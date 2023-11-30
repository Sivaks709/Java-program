class test
{
    int a=14; //NON STATIC SINGLE LINE INITIALIZER
    {
        System.out.println("Hi I Am ''NON STATIC MULTI LINE INITIALIZER");
        
    }
    public static void DEMO()
    {
        System.out.println("Hi I Am Demo Method");
    }
    public test()
    {
        System.out.println("Hi I Am No-Arguments");
        student a=new student();
    }
    public test(int a)
    {
        System.out.println("Hi I Am parameterized");
    }
}
