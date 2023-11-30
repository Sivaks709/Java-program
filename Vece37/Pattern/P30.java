public class P30 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            int a=1;
            for (int j = 0; j < n; j++) {
                if (a==n) {
                    a=1;
                }
                if (i<=j) {
                    System.out.print(a++ +" ");
                }
                else {
                    System.out.print((char)4+" ");
                }
            }
            a=1;
            System.out.println();
        }
    }
}
