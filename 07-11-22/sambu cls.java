class x
{
    static int a=20;
    int b=30;
    int c=10;
    public static void main(String[] args) {
       x x1=new x();
       x y=new x();
       System.out.println(x1.a-- +y.b++ +y.a++ +x1.c); 
    }
}
