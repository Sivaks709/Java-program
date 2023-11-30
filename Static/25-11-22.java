class test3
{
    final static int A;
    static
    {
        A=10;
    }
    final int b;
    {
        b=20;
    }
    public static void main(String[] args) {
        System.out.println(A);
        System.out.println(new test3().b);
    }

}
