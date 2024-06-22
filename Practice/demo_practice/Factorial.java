package demo_practice;

public class Factorial {
    public static int function_factorial(int num) {
        if (num>0) {
            return(num*(function_factorial(--num)));
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(function_factorial(5));
    }
}
