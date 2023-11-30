package TEST;

import java.util.Scanner;

public class parfact1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number : "); // 3, 6, 28, 496 ,8128
        int Num=s.nextInt(),sum=0;
        for (int i = 1; i < Num; i++) {
            if(Num%i==0)
            {
                sum+=i;
            }
        }
        if (sum==Num) {
            System.out.println("perfact");
        } else {
            System.out.println("not perfact");
        }
    }
}
