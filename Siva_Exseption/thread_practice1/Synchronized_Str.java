package thread_practice1;

class InnerSynchronized_Str {
    int count;
    public void count1() {
        count++;
    }

    public int get_Result() {
        return count;
    }
}

public class Synchronized_Str {
    public static void main(String[] args) throws InterruptedException {

        InnerSynchronized_Str obj1 = new InnerSynchronized_Str();
        
        Runnable r1 = () ->{
                for (int index = 1; index <= 1000; index++) {
                    obj1.count1();
                }
            };

        Runnable r2 = () ->{
                for (int index = 1; index <= 1000; index++) {
                    obj1.count1();
                }
            };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(obj1.get_Result());
    }
}
