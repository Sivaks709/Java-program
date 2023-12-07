public class Functional_Interface {
    Functional_Interface() {
    }
}

@FunctionalInterface
interface add {
    // void add1(int a,int b);
    int add2(int a, int b);
}

class dee extends Object {

    public static void main(String[] args) {
        add ref = (int aa, int bb) -> aa + bb;
        
        System.out.println(ref.add2(10,20));
        // System.out.println("String1".compareTo("string1"));
        // try {
        //     System.exit(5);
        // } catch (Exception e) {

        // } finally {
        //     System.out.println(12345);
        // }
    }
}