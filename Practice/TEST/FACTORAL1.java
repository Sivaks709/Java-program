package TEST;

import java.util.Scanner;

public class FACTORAL1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=s.nextInt(),fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
