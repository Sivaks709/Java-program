public class PRIVATE_CONSTRUCTOR {
    private PRIVATE_CONSTRUCTOR(int a1)
    {
        System.out.println("I Am Constractor");
        int a=a1;
        System.out.println(a);
    }
    public Object name() {
        PRIVATE_CONSTRUCTOR a=new PRIVATE_CONSTRUCTOR(55);
        return a;
    }
    public static void main(String[] args) {
        PRIVATE_CONSTRUCTOR EF=new PRIVATE_CONSTRUCTOR(82);
        System.out.println(EF.name());
    }
}
