package Equals;

// public class Hashcode
// {
//     static String name;
//     public static void main(String[] args)
//     {
//         Hashcode ref=new Hashcode();
//         System.out.println(ref);
//         System.out.println(ref.hashCode());
//     }
// }
class siv
{
    static String n="siva";
}
class kum 
{
    static String n="siva";
}
class Dri
{
    public static void main(String[] args)
    {
        System.out.println(siv.n.hashCode());
        System.out.println(kum.n.hashCode());
    }
}