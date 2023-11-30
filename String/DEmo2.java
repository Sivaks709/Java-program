public class DEmo2 {
    public static void main(String[] args) {
        StringBuffer s1,s2;
        s1=new StringBuffer("hello ");
        s2=s1;
        System.out.println(s1);
        System.out.println(s2);
        s1.append("World");
        System.out.println(s2);
        System.out.println(s1);
    }
}
