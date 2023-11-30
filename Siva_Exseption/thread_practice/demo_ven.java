package thread_practice;

public class demo_ven extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Welcome");
        }
    }
}

class Innerdemo_ven_1 extends Thread{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}


class Innerdemo_ven {
    public static void main(String[] args) {
        demo_ven foo = new demo_ven();
        Innerdemo_ven_1 foo1 = new Innerdemo_ven_1();
        foo1.start();
        foo.start();
    }
}
