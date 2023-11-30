public class Method_Overtiding {
    void msg() {
        System.out.println("Welcome Parent Class");
    }
}

/**
 * InnerMethod_Overtiding
 */
class InnerMethod_Overtiding extends Method_Overtiding {

    void msg() {
        System.out.println("Welcome Child Class");
    }
}

/**
 * InnerMethod_Overtiding_1
 */
abstract class InnerMethod_Overtiding_1 {
    /**
     * InnerMethod_Overtiding_2
     */
    public abstract void siva();

    InnerMethod_Overtiding_1() {
    }

    public static void main(String[] args) {
        // Method_Overtiding method_Overtiding = new InnerMethod_Overtiding();
        // method_Overtiding.msg();
        // StringBuffer sb1, sb2;
        // sb1 = new StringBuffer("Hello");
        // sb2 = sb1;
        // System.out.println(sb1);// Hello
        // System.out.println(sb2);// Hello
        // sb1.append(" World");
        // System.out.println(sb1);// Hello World
        // System.out.println(sb2);// Hello World
        // System.out.println(sb1 == sb2);// true
        // System.out.println(sb1.equals(sb2));
        StringBuffer sb1, sb2;
        sb1 = new StringBuffer("10");
        sb2 = new StringBuffer("Hello");
        //int num = Integer.parseInt(sb1);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1 == sb2);// false
        System.out.println(sb1.equals(sb2));
    }
}