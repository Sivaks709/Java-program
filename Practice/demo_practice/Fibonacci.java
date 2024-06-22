package demo_practice;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci_process(int num) {
        return (num <= 1 ? num : fibonacci_process(num - 1) + fibonacci_process(num - 2));
    }
    public static void main(String[] args) {
        System.out.print("Enter The Range : ");
        int a=new Scanner(System.in).nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci_process(i) + " ");
        }
    }
}
