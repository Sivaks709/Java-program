package TEST.inter;

import java.util.Scanner;

public class Prime_Or_Not {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n = s.nextInt(),count=0;
        for (int i = 2; i <= n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        System.out.println(count==1? n+" Prime Number...":n+" Not A Prime Number...");
    }
}