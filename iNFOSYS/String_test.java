public class String_test{
    public static void main(String a[]){
        StringBuffer s1,s2;
        s1 = new StringBuffer("Hello");
        s2 = new StringBuffer("Hello");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
        String foo = new String("Hello");
    
        String foo1 = new String("Hello");
        System.out.println(foo==foo1);
        System.out.println(foo.equals(foo1));
    
    }
}