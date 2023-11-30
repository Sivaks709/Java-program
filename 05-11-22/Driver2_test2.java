class Driver2_test2 {
    {
        System.out.println("Hi I Am Non Static Multi Line Initializer\n");
    }
    boolean b;
    double d=14;
    public int add(int a,int b)
    {
        return a+b;
    }
    Driver2_test2()
    {
        System.out.println("Hi From No Argument\n");
    }
    Driver2_test2(int a)
    {
        System.out.println("Hi From Parmeterized Const - "+a+"\n");
    }
    Driver2_test2(String s,int b)
    {
        System.out.println("Hi From Parmeterized Const - "+s+" - "+b+"\n");
    }
}
