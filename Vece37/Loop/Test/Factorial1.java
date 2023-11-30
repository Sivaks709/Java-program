package Test;
import java.util.*;

public class Factorial1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter value : ");
        int n=s.nextInt(),fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}
