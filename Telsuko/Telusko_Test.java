class Telusko_Test {

    int num1;
    static int num2;
    public void show() {
        num2=9;
    }
    public void name() {
        Telusko_Test tt = new Telusko_Test();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(tt.num1);
    }
}
 
class InnerTelusko_Test {

    public static void main(String[] args) {

        Telusko_Test.num2=5;
        System.out.println("1 : "+Telusko_Test.num2);

        Telusko_Test obj1 = new Telusko_Test();
        Telusko_Test obj2 = new Telusko_Test();
        Telusko_Test obj3 = new Telusko_Test();
        obj1.show();
        System.out.println("2 : "+Telusko_Test.num2);
        obj1.num1=2;
        obj2.num1=3;
        // obj3.num1=4;
        obj1.num2=20;
        obj2.num2=30;
        obj3.num2=40;
        // System.out.println(obj1.num1);
        // System.out.println(obj2.num1);
        // System.out.println(obj3.num1);
        obj1.name(); // 2 40
        obj2.name(); // 3 40
        obj3.name(); // 4 40
    }
}