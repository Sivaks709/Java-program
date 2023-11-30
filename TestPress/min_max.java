public class min_max {
    public static void main(String[] args) {
        int num[] = { 54, 546, 548, 60 };
        int min = num[0], max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max) {
                max=num[i];
            }
            if (num[i]<min) {
                min=num[i];
            }
        }
        System.out.println(min +" " + max);
    }
}
