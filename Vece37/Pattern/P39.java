public class P39 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j+1||i<=j-1) {
                    System.out.print("# ");
                } else {
                    System.out.print((char)2+" ");
                }
            }
            System.out.println();
        }
    }
}
