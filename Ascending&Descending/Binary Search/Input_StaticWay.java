import java.util.*;
public class Input_StaticWay {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]={};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]+" Enter The Elements : \n");
            a[i]=s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
