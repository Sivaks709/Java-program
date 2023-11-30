class Method_Shadowing {

    public static void m1() {
        System.out.println("JAVA");
    }
}

class InnerMethod_Shadowing extends Method_Shadowing {

    public static void m1() {
        System.out.println("PYTHON");
    }
    public static void main(String[] args) {
        Method_Shadowing ref=new InnerMethod_Shadowing();
        ref.m1();
        Method_Shadowing.m1();
        InnerMethod_Shadowing.m1();
    }
}
