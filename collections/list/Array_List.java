import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        aList.add(15);
        aList.add(31);
        aList.add(7);
        aList.add(35);
        aList.add(12);
        aList.set(1, 24);
        for (Object object : aList) {
            System.out.println(object);
        }
        aList.iterator();
    }
}
