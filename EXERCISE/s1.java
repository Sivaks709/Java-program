
public class s1 {
    public static void main(String[] args) {
        String s="good";
        String a=s;
        String b=s;
        s="bad";
        // s="badboy";
        // s="badboy2";
        // s="badboy1";
        System.out.println(s+"\t"+a+"\t"+b);
        System.out.println(s.hashCode()==b.hashCode());
        System.out.println(a.hashCode()==b.hashCode());
    }
    
}
