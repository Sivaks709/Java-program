public class P26 {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j) {
                    System.out.print(ch++ +" ");
                } else {
                    System.out.print((char)2+" ");
                }
            }
            System.out.println();
            ch='A';
        }
    }
}
