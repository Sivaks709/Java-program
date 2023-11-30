import java.util.Scanner;

public class reverse_Num {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num=new Scanner(System.in).nextInt(),res=0;
        String srt=String.valueOf(num);
        for (int i = srt.length()-1; i >= 0; i--) {
            String str=String.valueOf(srt.charAt(i));
            int temp = Integer.parseInt(str);
            if (temp != 0) {
                System.out.print(srt.charAt(i));
                res++;
            }               
            else if (res>0) {
                System.out.print(srt.charAt(i));
            }
        }
    }
}
