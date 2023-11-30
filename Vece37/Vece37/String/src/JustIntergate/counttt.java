package JustIntergate;

public class counttt {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int a1[]={1,2,3,0,5};
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a[i]==a1[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
