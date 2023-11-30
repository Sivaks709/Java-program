import java.util.Scanner;

public class Find_Nth_Large {
    public static void main(String[] args) {

        int a[]={5,6,8,7,9,54,65,84},l=a[0];
        System.out.print("Enter The Number : ");
        int Num=new Scanner(System.in).nextInt();
        for (int i = 0; i < Num; i++) {
            l=a[0];
            for (int j = 0; j < a.length; j++) {
                if (l<a[j]) {
                    l=a[j];
                }
            }
            for (int j = 0; j < a.length; j++) {
                if (l==a[j]) {
                    a[j]=-1;
                }
            }
        }
        System.out.println(l);
    }
}
