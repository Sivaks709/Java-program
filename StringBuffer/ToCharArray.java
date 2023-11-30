public class ToCharArray {
    public static void main(String[] args)
    {
        String s = "Hi I Am Spider";
        char s1[] = s.toCharArray();
        System.out.println(s1);
        for (int i = 0; i < s.length(); i++)
        {
           if (s1[i]=='i' || s1[i]=='a' || s1[i]=='p' || s1[i]=='r' || s1[i]=='s')
           {
                s1[i]='Q';
           }
        }
        System.out.println(s1);
    }
}
