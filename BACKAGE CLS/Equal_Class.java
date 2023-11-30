class Apple extends Object
{
    double price=145;
}
class mango
{
    double prive=145;
}
class driver
{
    public static void main(String[] args)
    {
        Apple ref=new Apple();
        mango re=new mango();
        System.out.println(re.equals(ref));
        System.out.println(ref.equals(re));
        System.out.println(ref.equals(ref));
        System.out.println(re.equals(re));
    }
}
