import java.util.Scanner;

public class tabbu {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 1, 8, 3, 4, 5 };
        int b[] = { 9, 6, 2, 7};
        int res[] = new int[a.length + b.length];
        int temp = 0;
        for (int i = 0, m = 0; i < res.length; i++) {
            if (i < a.length) {
                res[i] = a[i];
            } else {
                res[i] = b[m];
                m++;
            }
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] > res[j]) {
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
