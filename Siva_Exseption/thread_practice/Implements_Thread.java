package thread_practice;

class InnerImplements_Thread_1 implements Runnable{

    public synchronized void run() {
        for(int i=0;i<100;i++){
            System.out.println("Hi  : "+ Thread.currentThread().getName());
        }
    }
}

class InnerImplements_Thread implements Runnable{

    public synchronized void run() {
       for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
public class Implements_Thread {
    public static void main(String[] args) throws InterruptedException {
        InnerImplements_Thread_1 obj1 = new InnerImplements_Thread_1();
        InnerImplements_Thread obj2 = new InnerImplements_Thread();
        Thread t1  = new Thread(obj1);
        Thread t2  = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
