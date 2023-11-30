package Test;

public class A {
    public void name() {
        System.out.println("1");
    }
    public static void name1() {
        System.out.println(2);
    }
}
/**
 * InnerexA-
 */
class InnerA extends A{
    public void name11() {
        System.out.println("kimar");
    }

    public static void main(String[] args) {
        A foo = new InnerA();
        foo.name();
        
    }
}
