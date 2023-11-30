// class siva
// {
//     int a=111;
//     siva(int f)
//     {
//         int b=23;
//         System.out.println(a);
//         System.out.println(b);
//         this.a=f;
//         System.out.println(a);
//     }
//     siva()
//     {
//         System.out.println(a);
//         System.out.println(a);
//     }
// }
class kum
{
    static int number;
    static String name;
    
    kum(int n,String n1)
    {
        this.number=n;
        this.name=n1;
    }
    public void na() {
        System.out.println(number);
        System.out.println(name);
    }
    kum()
    {
        System.out.println(number);
        System.out.println(name);
    }
}
class siv
{
    public static void main(String[] args)
    {
        kum ref=new kum(10,"sivakumar");
        kum ref1=new kum();
        ref.na();
    }
}