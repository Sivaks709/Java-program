public class s2
{
    static String res="";
    public static void main(String[] args) {
        String s1="Hi How Are You";
        // System.out.println(s1.charAt(0));
        String s2[]=s1.split(" ");
        for (int i = s2.length-1; i >= 0; i--) {
            res+=rev(s2[i]+" ");
        }
        System.out.println(res);
    }
    public static String rev(String str) {
        String rev="";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);
        }
        return rev;
    }
}
