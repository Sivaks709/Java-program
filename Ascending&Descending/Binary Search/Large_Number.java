public class Large_Number {
    public static void main(String[] args) {
        int a[]={1,2,10,45,60,309};
        int Large=a[0];
        for (int i = 0; i < a.length; i++) {
            if (Large<a[i]) {
                Large=a[i];
            }
        }
        System.out.println("Large Elements Is : "+Large);
    }
}
