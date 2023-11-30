package TEST;

import java.util.Scanner;

/**
 * FACTOR1
 */
public class FACTOR1 {

    static Scanner s= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int Num=s.nextInt();
        for (int i = 1; i <= Num; i++) {
            if (Num%i==0) {
                System.out.println(i);
            }
        }
    }
}