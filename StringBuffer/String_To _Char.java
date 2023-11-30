class String_To_Char
{
    public static void main(String[] args)
    {
        String s="Java";
        char ch[]=new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i]=s.charAt(i);
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
