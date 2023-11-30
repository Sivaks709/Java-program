package DEMO;

public class LENGTH_5_TO_1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 5 ; j>i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
