public class Exception_Object_propegation {
    public static void main(String[] args) {
        Exception_Object_propegation foo = new Exception_Object_propegation();
        foo.name();
    }
    public void name() {
        System.out.println(10/0);
    }
}
