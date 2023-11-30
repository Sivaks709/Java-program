package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {
    public static void main(String[] args) {
        List<String> foo = new ArrayList<String>();
        foo.add("1");
        foo.add("2");
        foo.add("3");
        foo.add("4");
        Iterator<String> i1=foo.iterator();
        System.out.println(i1.hasNext());

        ListIterator<String> l2=foo.listIterator();
        System.out.println(l2.next());
    }
}
