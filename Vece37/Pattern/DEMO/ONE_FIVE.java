package DEMO;

public class ONE_FIVE {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
