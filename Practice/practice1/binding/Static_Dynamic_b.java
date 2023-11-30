package practice1.binding;

public class Static_Dynamic_b {
    
    void msg() {
        System.out.println("pooda");
    }
}
class InnerStatic_Dynamic_b extends Static_Dynamic_b{

    void msg() {
        System.out.println("Vaada");
    }
    public static void main(String[] args) {
        Static_Dynamic_b ref = new InnerStatic_Dynamic_b();
        ref.msg();
    }
}
