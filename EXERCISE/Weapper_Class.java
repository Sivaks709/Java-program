import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Weapper_Class {
    public static void main(String[] args) {
        // int a=10;
        // Integer ref=Integer.valueOf(a);
        // int ref1=ref.intValue();
        // int n=01;
        // Integer n1=n;
        // String s="10";
        // int k=Integer.parseInt(s);
        // System.out.println(k);
        // LinkedList sp=new LinkedList<>();
        // sp.add("kumar");
        // sp.add("kumar1");
        // sp.add("kumar3");
        // sp.add("kumar2");
        // System.out.println(sp.get(2));

        ArrayList A=new ArrayList();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        ArrayList A1=new ArrayList<>(A);
        System.out.println(A1);
    }
}
