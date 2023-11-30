package Test;

/**
 * reverse1
 */
public class reverse1 {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1};
        int res[]=new int[a.length];
        int com=0;
        for (int i = 0,m=res.length-1; i < res.length; i++,m--)
        {
            res[i]=a[m];
            if (i%2==0) {
                com+=a[i];
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
        System.out.println(com);
    }
}
