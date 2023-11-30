public class s3 {
    public static void main(String[] args) {
        String s1="coder45",s2="byte457";
        char ch[]=new char[s2.length()+s1.length()];
        for (int i = 0,m=0,n=s2.length()-1; i < ch.length; i++) {
            if (i%2==0) {
                ch[i]=s1.charAt(m++);
            }
            else
            {
                ch[i]=s2.charAt(n--);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}
