public class testpress_Q3 {
    public static void main(String[] args) {
        int n[]={54, 546, 548, 60};
        String s="";
        for (int i = n.length-1; i >= 0; i--) {
            s=s+n[i];
        }
        long fin=Long.valueOf(s);
        System.out.println(fin+10);
    }
}
