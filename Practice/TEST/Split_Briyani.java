package TEST;

public class Split_Briyani {

    public static void main(String[] args) {
        String s = "I Love Biriyani";
        String s1[] = s.split(" ");
        System.out.println(replease_the_str(s1,"Love","Biriyani","hate","curd"));
    }

    public static String replease_the_str(String srt[],String old1,String old2,String new1,String new2) {
        String res="";
        for (int i = 0; i < srt.length; i++) {
            if (srt[i].equals(old1)) {
                srt[i]=new1;
            }
            else if(srt[i].equals(old2))
            {
                srt[i]=new2;
            }
            res+=srt[i]+" ";
        }
        return res;
    }
}
