public class Method_Shadowing {
    public static void name() {
        System.out.println("Parent");
    }
}


class InnerMethod_Shadowing extends Method_Shadowing {

    public static void name() {
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Method_Shadowing ref = new InnerMethod_Shadowing();
        ref.name();
        Method_Shadowing.name();
        InnerMethod_Shadowing.name();
    }
}
