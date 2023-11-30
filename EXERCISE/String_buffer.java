// public class String_buffer {
//     public static void main(String[] args) {
//         StringBuffer foo = new StringBuffer("siva");
//         StringBuffer foo1 = new StringBuffer("siva");
//         System.err.println(foo.equals(foo1));
//     }
// }

class InnerString_buffer {

    final public void name() {
        System.out.println("siva");
    }
    final public static void name1() {
        System.out.println("siva1");
    }
}

final class InnerString_buffer_1 extends InnerString_buffer{

    static InnerString_buffer foo = new InnerString_buffer();
    public static void main(String[] args) {
        name1();
        foo.name();
    }
}