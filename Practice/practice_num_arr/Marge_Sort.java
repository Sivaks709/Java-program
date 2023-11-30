package practice_num_arr;

public class Marge_Sort {
    public static void main(String[] args) {
        int a1[] = { 1, 7, 3, 6, 5 };
        int a2[] = { 9, 4, 2, 8 };
        int res[] = new int[a1.length + a2.length];
        for (int i = 0, j = 0; i < res.length; i++) {
            if (a2.length > i) {
                res[i] = a2[i];
            } else {
                res[i] = a1[j];
                j++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (res[i] < res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
