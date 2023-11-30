public class Demo1 {
    public static void main(String[] args) {
        StringBuffer s1,s2;
        s1=new StringBuffer("KUMAR");
        s2=new StringBuffer("KUMAR");
        s1=s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2==s1);
        System.out.println(s1.equals(s2));
    }

}
