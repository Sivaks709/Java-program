package DEMO;

public class FIVE_ONE {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j+i>n ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
