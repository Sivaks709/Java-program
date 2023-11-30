import java.util.*;
public class NthLargest1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n[]={12,98,6,95,98,3,2,76};
        int l=n[0];
        System.out.print("Enter number : ");
        int n1=s.nextInt();
       for (int i = 1; i <= n1; i++) {
            l=n[0];
            for (int j = 0; j < n.length; j++) {
                if (l<n[j]) {
                    l=n[j];
                }
            }
            for (int j = 0; j < n.length; j++) {
                if (n[j]==l) {
                    n[j]=-1;
                }
            }
       }
       System.out.println(l);
    }
}
