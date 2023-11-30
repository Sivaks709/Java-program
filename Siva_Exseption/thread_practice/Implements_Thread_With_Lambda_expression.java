package thread_practice;

public class Implements_Thread_With_Lambda_expression {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Hi");
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 25; i++) {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
