// class t1
// {
//     static
//     {
//         System.out.println("Hi I Am NON STATIC METHOD --------- > 1");
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("Hi I Am Main Method");
//         // t1 ref=new t1();
//     }
//     static
//     {
//         System.out.println("Hi I Am NON STATIC METHOD --------- > 2");
//     }
// }
// class m
// {
//     int a;
//     {
//         System.out.println("hiiiiiii");
//     }
//     public void name() {
//         System.out.println(a=10+50);
//     }
// }
// class d extends m
// {
//     public void name() {
//         int a=20;
//         System.out.println(a);
//     }
//     public static void main(String[] args)
//     {
//         m ref=new m();
//         ref.name();
//         m ref1=new d();
//         ref1.name();
//     }
// }
// interface test
// {
//     public void name();
//     public static void d()
//     {
//         System.out.println("Hi I Am Test Static Method");
//     }
// }
// interface test1
// {
//     public void name();
//     public static void d1()
//     {
//         System.out.println("HIIIIIIIIIIIIIIIIIII");
//     }
// }
// class c implements test,test1
// {
//    public void name() 
//    {
//     System.out.println("Siva");
//    }
//    public void dance()
//    {
//     System.out.println("Kumar");
//    }
//    public static void main(String[] args)
//    {
//         c ref=new c();
//         ref.dance();
//         ref.name();
//         test1.d1();
//         test.d();
//    }
// }