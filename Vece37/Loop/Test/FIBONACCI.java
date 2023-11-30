package Test;
public class FIBONACCI {
    public static void main(String[] args) {
        int n=0,n1=1,res,count=10;
        System.out.print(n+" "+n1+" ");
        for (int i = 2; i < count; i++) {
            res=n1+n;
            System.out.print(res+" ");
            n=n1;
            n1=res;
        }
    }
}
