public class Final_over
{
    public void p1()
    {
        System.out.println("I Am P1");
    }
    public static void S1()
    {
        System.out.println("Welcome To S1 static ***");
    }
}
class InnerFinal_over extends Final_over
    {
        public void p1()
        {
            System.out.println("I Am Child P1");
        }

        public void p23()
        {
            System.out.println("I Am Child P1");
        }
        public static void S1()
        {
            System.out.println("Welcome To Child S1 static @@@");
        }
        public static void main(String[] args)
        {
            Final_over ref=new InnerFinal_over();
            InnerFinal_over ref1=(InnerFinal_over) ref;
            // InnerFinal_over re=new InnerFinal_over();
            ref.p1();
            ref.S1();
            System.out.println("*****************************");
            ref1.p1();
            ref1.S1();
        }
    }