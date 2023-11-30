public class First_And_Last
{
    public static void main(String[] args)
    {
        String s="Hi Iam JDBC";
        char ch[]=s.toCharArray();
        char s1[]=new char[ch.length];
        // System.out.println(ch);
        for (int i = s.length()-1,j=0; i >= 0; i--,j++)
        {
            s1[j]=ch[i];
        }
        System.out.println(s1);
    }
}
