public class P37 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j==n+1||i+j==n-3) {
                    System.out.print("# ");
                } else {
                    System.out.print((char)2+" ");
                }
            }
            System.out.println();
        }
    }
}
