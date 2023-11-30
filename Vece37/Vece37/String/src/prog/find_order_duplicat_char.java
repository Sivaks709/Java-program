package prog;

public class find_order_duplicat_char {
    public static void main(String[] args) {
        String s="aabbbffidddds";
        char c[]=s.toCharArray();
        System.out.println(s.length());
        
        int count=1;
        for (int i = 0; i < c.length-1; i++) {
            if (c[i]==c[i+1]) {
                count++;
            }
            else{
                System.out.println(c[i]+"    :    "+ count);
                count=1;
            }
        }
        System.out.println(c[c.length-1]+"    :    "+count);
    }
}
