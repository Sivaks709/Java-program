package DEMO.SPACE;

public class S1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(' ');
            }
            for (int j = i+1; j>=1 ; j--) {
                System.out.print(j+"");
            }
            System.out.println();
        }        
    }
}
