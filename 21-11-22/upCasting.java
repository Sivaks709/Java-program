class upCasting // Parent Class
{
    int a=10,b=20;
}
class Downcastin extends upCasting // Child Class
{
    int c=30,d=40;
    public static void main(String[] args)
    {
        upCasting ref=new Downcastin(); // UP CASTING
        Downcastin ref1=(Downcastin) ref; // DOWN CASTING
        System.out.println(ref.a);
        System.out.println(ref.b);
        System.out.println(ref1.a);
        System.out.println(ref1.b);
        System.out.println(ref1.c);
        System.out.println(ref1.d);
    }
}
