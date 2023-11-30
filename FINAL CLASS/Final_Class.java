import java.util.*;
final class Final_Class {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Value : ");
        int n=s.nextInt();
        System.out.println("Hi I Am Abstract Class Main Method");
        System.out.println(a1(n));
    }
    final static int a1(int s)
    {
        int n=10;
        System.out.println(n);
        n=s;
        return n;
    }
}