public class s5 {
    public static void main(String[] args) {
        String s="aaabbaaccc";
        char ch[]=s.toCharArray();
        int counnt=1;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                counnt++;
            }
            else
            {
                System.out.println(ch[i]+" : "+counnt);
                counnt=1;
            }
        }
        System.out.println(ch[ch.length-1]+" : "+counnt);
    }
}
