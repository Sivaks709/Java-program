package TEST.inter;

public class Add {
    public static void main(String[] args) {
        int a=10,b=20;
        // c=a;
        // a=b;
        // b=c;
        a=a+b; // 10 + 20 = 30
        b=a-b; // 30 - 20 = 10
        a=a-b; // 30 - 10 = 20
        System.out.println(a);
        System.out.println(b);
    }
}
