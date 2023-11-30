public class t1
{
    static String name1="siva";
}
class t2 extends t1
{
    static String name="siva";
    public static void main(String[] args)
    {
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
    }
}