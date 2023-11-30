package Equals;

public class Apple extends Object
{
    double Pricr=145;
}
class MENGO
{
    double Pricr=145;
}
class Driver1
{
    public static void main(String[] args)
    {
        Apple siv=new Apple();
        MENGO kum=new MENGO();
        System.out.println(siv.equals(kum));
        System.out.println(siv.equals(kum));
        System.out.println(kum.equals(kum));
        System.out.println(kum.equals(siv));
    }
}
