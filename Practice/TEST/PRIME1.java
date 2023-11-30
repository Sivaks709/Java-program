package TEST;

// import java.sql.Ref;

import java.util.Scanner;

public class PRIME1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int n = s.nextInt(), count = 0;
        for (int i = 1; i <= n; i++) {
            count=0;
            for (int j = 1; j <= n; j++) {
                if (i%j==0) {
                    count++;
                    System.out.print(i+" this is i value "+count+ " ");
                }
                else if (j>i) {
                    break;
                }
            }
            if (count==2 || count==1) {
                System.out.println(i);
            }
        }
    }
}
// package TEST;

// /**
//  * PRIME1
//  */
// public class PRIME1 {
//     int a=5654;
//     public static void main(String[] args) {
//         boolean b = true;
//         int a = 0;
//         String s = "gddgd";
//         System.out.println(b ? a : s);
//         PRIME1 red=new PRIME1();
//         red.name();
//     }
//     PRIME1(){
//         this(654);
//         System.out.println("Hi I Am Privete");
//     }
//     PRIME1(int a){
//         this("sivakumr");
//         System.out.println("*****"+a+"*****");
//     }
//     public void name() {
//         long a=this.a;
//         System.out.println(a);
//     }
//     private PRIME1(String s){
//         System.out.println("Hi I Am Privete1");
//     }
//     private PRIME1(String s,double d){
//         System.out.println("Hi I Am Privete1");
//     }
// }
// class PRIME1
// {
//     int a=10;
//     static int b=20;
// }
// class dd extends PRIME1
// {
//     static int a=30;
//     static int b=35;
//     public static void main(String[] args) {
//         PRIME1 fre=new dd();
//         dd ref=(dd) fre;
//         System.out.println(fre instanceof Ref);
//     }
//     dd(){
//         int a=super.a;
//         int b=super.b;
//         int c=this.a;
//         int d=this.b;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }