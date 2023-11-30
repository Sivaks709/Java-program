package abstraction;

abstract public class Test {

    public void namns() {
        System.out.println("Hi I Am Non Static Method...");
    }

    void name() {

    }

    final static void namef() {
        System.out.println("Hi I Am Final Method...");
    }

    public static void names() {
        System.out.println("Hi I Am Static Method...");
    }

    static {
        System.out.println("Hi I Am Static MLI...");
    }

    {
        System.out.println("Hi I Am Non Static MLI...");
    }

    @Override
    public String toString() {
        return "Test []";
    }
}


// Class 2

class DriveTest14 extends Test {

    public void namns() {
        System.out.println("Hi I Am Child Non Static Method...");
    }

    final public void namef1() {
        System.out.println("Hi I Am Child Final Method...");
    }

    public static void names() {
        System.out.println("Hi I Am Child Static Method...");
    }

    static {
        System.out.println("Hi I Am Child Static MLI ...");
    }

    {
        System.out.println("Hi I Am Child Non Static MLI...");
    }

    public static void main(String[] args) {
        DriveTest14 ref = new DriveTest14();
        Test ref1 = (Test) ref;
        // ref.namef();
        ref.namns();
        names();
        System.out.println(ref.equals(ref1));
    }
}
