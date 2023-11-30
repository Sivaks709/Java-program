package DEMO;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j+i > n; j--) {
                System.out.print(n-i+" ");
            }
            System.out.println();
        }
    }
}
