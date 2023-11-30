package vlc;

public class testdrive extends Thread {

    public void run() {
        test foo = new test();
        test.name();
        test.name3();
        foo.name2();
        foo.name1();
    }
    public static void main(String[] args) {
        testdrive ref=new testdrive();
        testdrive ref1=new testdrive();
        // testdrive ref2=new testdrive();
        System.out.println(Thread.currentThread().getName());
        ref.start();
        ref1.start();
        // ref1.start();
        // ref2.start();
    }
}
