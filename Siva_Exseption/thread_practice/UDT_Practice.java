package thread_practice;

class InnerUDT_Practice_1 extends Thread{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}
class InnerUDT_Practice extends Thread{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}
public class UDT_Practice {

    public static void main(String[] args) {
        InnerUDT_Practice_1 ref1 = new InnerUDT_Practice_1();
        InnerUDT_Practice ref = new InnerUDT_Practice();
        ref.start();
        ref1.start();
    }
}