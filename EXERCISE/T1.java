// interface i1
// {
//     public static void m1()
//     {
//         System.out.print("I LOVE ");
//     }
// }
// interface i2
// {
//     public static void m1()
//     {
//         System.out.print("YOU "+(char)2+(char)2+(char)2+(char)2+(char)2+(char)2+(char)2+(char)2);
//     }
// }
// class c
// {
//     public static void main(String[] args)
//     {
//         i1.m1();
//         i2.m1();
//     }
// }
class demo extends c2
{
    public void n1()
    {
        System.out.println("1234567890");
    }
    public static void main(String[] args)
    {
        demo r=new demo();
        r.n1();
        c2 r1=new c2();
        r1.n1();
        
    }
}
class c2
{
    public void n1()
    {
        System.out.println("ASDFGHJKLQWERTYUIOP");
    }
}

/**
 * T1
 */