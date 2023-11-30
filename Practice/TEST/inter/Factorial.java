package TEST.inter;
import java.util.*;

public class Factorial {
    static Scanner s=new Scanner(System.in);
    static int factorial=1; // 4
    public static void main(String[] args) {
        System.out.print("Enter Number : ");  // 4
        int n=s.nextInt();
        System.out.println(fact(n)); // 24
    }
    public static int fact(int num) { // 4
        if (num!=0) {
            factorial*=num; // 1*4 = 4*3 = 12*2 = 24*1 = 24
            num--; // 3 2 1 0
            fact(num);  // 3 2 1 0
        }
       return factorial;
    }
}
