public class Reverce {

    public static void main(String[] args) {
        StringBuffer sb1,sb2;
        sb1=new StringBuffer("CAT");
        sb2=new StringBuffer("");
        for (int i = sb1.length()-1; i >=0; i--) {
            sb2.append(sb1.charAt(i));
        }
        System.out.println(sb2);
    }
}