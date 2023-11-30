public class find_large {
    public static void main(String[] args) {
        int a[]={5,6,2,8,7,0,9,54,65,84},res=a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (res<a[j]) {
                    res=a[j];
                }
            }
        }
        System.out.println(res);
    }
}
