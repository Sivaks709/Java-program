public class Char_To_String_Con {

    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e'};
        String s="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
        System.out.println(s);
    }
}