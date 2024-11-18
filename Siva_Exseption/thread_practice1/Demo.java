package thread_practice1;

public class Demo {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi");
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}