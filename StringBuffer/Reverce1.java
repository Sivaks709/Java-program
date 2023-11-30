public class Reverce1 {

    public static void main(String[] args) {
        String s="Hi Iam Java";
        String s1[]=s.split(" ");
        String res="";
        for (int i = s1.length-1; i >= 0; i--) {
            res+=s1[i]+" ";
        }
        System.out.println(res);
    }
}