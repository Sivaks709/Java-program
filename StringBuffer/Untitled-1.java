class U
{
    public static void main(String[] args)
    {
        String s="Hi Iam Java";
        String s1[]=s.split(" ");
        String ch[]=new String[s1.length];
        for (int i = ch.length-1,j=0; j>=ch.length-1; i--,j++) {
            ch[j]=s1[i];
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
