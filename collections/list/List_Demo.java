import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class List_Demo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pQueue=new PriorityQueue<>();
        pQueue.add(5);
        pQueue.add(6);
        pQueue.add(1);
        pQueue.add(3);
        pQueue.add(15);
        pQueue.add(2);
        // for (Object object : pQueue) {
        //     System.out.print(object+" ");
        // }
        // System.out.println();
        // System.out.println(pQueue.poll());
        // System.out.println(pQueue.peek());
        // System.out.println(pQueue.poll());
        // System.out.println(pQueue.peek());
        // Deque d =new LinkedList<>();
        // d.add(5);
        // d.add("fdsll");
        // System.out.println(d);
        // HashMap foo = new HashMap<>();
        // foo.ent

        LinkedList foo = new LinkedList();
        foo.add(6);
        foo.add(19);
        foo.add(3);
        foo.add(15);
        foo.add(34);
        foo.add(7);
        ListIterator li= foo.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.previous());
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }
}