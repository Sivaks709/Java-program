public class s4 {
    public static void main(String[] args) {
        String s="hell olaks laks";
        char ch[]=s.toCharArray();
        int res=1;
        for (int i = 0; i < ch.length; i++) {
            res=1;
            for (int j=i+1; j < ch.length; j++) {
                if (ch[i]==ch[j]) {
                    res++;
                    ch[j]=' ';
                }
            }
            if (res>=1&&ch[i]!=' ') {
                System.out.println(ch[i]+" : "+res);
            }
        }
    }
}
