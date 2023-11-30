public class Create_My_Own_Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting Thread"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Create_My_Own_Thread foo = new Create_My_Own_Thread();
        Thread t1 = new Thread(foo,"1st");
        Thread t2 = new Thread(foo,"2st");
        Thread t3 = new Thread(foo,"3st");
        t1.start();
        t3.start();
        t2.start();
    }
}