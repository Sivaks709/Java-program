package TEST.inter;

import java.util.Scanner;

public class Palindrom {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter The Value : ");
        
        int val = scan.nextInt(), temporary = val, result = 0;
        while (val > 0) {
            result = result * 10 + (val % 10);
            val /= 10;
        }
        System.out.println(temporary == result ?result+" Is Palindrome" :result+" Is Not Palindrome");
    }
}
