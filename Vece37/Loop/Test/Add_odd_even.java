package Test;

public class Add_odd_even {
    public static void main(String[] args) {
        int n=246544745,sum=0,sum1=0;
        while (n>0) {
            int l=n%10;
            if (l%2==0) {
                sum+=l;
            } else {
                sum1+=l;
            }
            n=n/10;
        }
        System.out.println(sum+"    "+sum1);
    }
}
