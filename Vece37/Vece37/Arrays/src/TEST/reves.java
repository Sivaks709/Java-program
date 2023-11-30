package TEST;

public class reves {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int res[]=new int[a.length];
        for (int i = a.length-1,j=0; i >= 0; i--,j++) {
            res[j]=a[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
