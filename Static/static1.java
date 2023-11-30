class no_1
{
    static int a=14;
    static boolean b;
    static
    {
        int b=20;
        System.out.println("hi i am static multi line initializer --------->  1");
        System.out.println(b);
    }
    {
        System.out.println("hi i am NON static multi line initializer --------->  1");
    }
    public static void main(String[] args) {
        int a=18;
        System.out.println("hi i am main");
        System.out.println(a);
    }
    {
        System.out.println("hi i am NON static multi line initializer --------->  2");
    }
    static
    {
        System.out.println("hi i am static multi line initializer --------->  2");
        System.out.println(a);
    }
}