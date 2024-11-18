package thread_practice1;

public class Thread_Class {
    public static void main(String[] args) {
        // new InnerThread_Class1().start();
        // new InnerThread_Class().start();

        new Thread(new InnerThread_Class1()).start();
        new Thread(new InnerThread_Class()).start();
        
    }
}


class InnerThread_Class extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi : "+Thread.currentThread());
        }
    }
}


class InnerThread_Class1 extends Thread {
    
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello : "+Thread.currentThread());
        }
    }
}