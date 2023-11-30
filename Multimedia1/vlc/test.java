package vlc;

public class test{
    synchronized static void name() {
        Thread.currentThread().setName("Static-1 ");
        for (int index = 1; index <= 10; index++) {
            System.out.print(Thread.currentThread().getName()+" "+index+" ");
        }
        System.out.println();
    }
    synchronized static void name3() {
        Thread.currentThread().setName("Static-2 ");
        for (int index = 1; index <= 10; index++) {
            System.out.print(Thread.currentThread().getName()+" "+index+" ");
        }
        System.out.println();
    }
    synchronized void name1() {
        Thread.currentThread().setName(" Non Static-1 ");
        for (int i = 20; i < 31; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    synchronized void name2() {
        Thread.currentThread().setName(" Non Static-2 ");
        for (int i = 20; i < 31; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}