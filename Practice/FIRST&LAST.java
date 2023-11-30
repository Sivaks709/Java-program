import java.util.Scanner;

class FIRST_LAST {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number");
        int n=s.nextInt(),last=n%10,sum=0,first=0;
        n/=10;
        while (n>9) {
            sum+=n%10;
            n/=10;
        }
        first=n+last;
        if (first==sum) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
