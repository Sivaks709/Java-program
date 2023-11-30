public class Extends_Thread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Extends_Thread ref = new Extends_Thread();

        Thread t1 = new Thread(ref,"Thread Extends Starting 1");
        Thread t2 = new Thread(ref,"Thread Extends Starting 2");
        Thread t3 = new Thread(ref,"Thread Extends Starting 3");
        Thread t4 = new Thread(ref,"Thread Extends Starting 4");
        Thread t5 = new Thread(ref,"Thread Extends Starting 5");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
    
}
