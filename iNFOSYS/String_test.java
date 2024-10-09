public class String_test {
    public static void main(String a[]) {
        // StringBuffer s1,s2;
        // s1 = new StringBuffer("Hello");
        // s2 = new StringBuffer("Hello");
        // // System.out.println(s1==s2);
        // // System.out.println(s1.equals(s2));
        // System.out.println(s1.hashCode()==s2.hashCode());
        // String foo = new String("Hello");

        // String foo1 = new String("Hello");
        // System.out.println(foo==foo1);
        // System.out.println(foo.equals(foo1));

        int arr[] = {     };
        find_Max_Val(arr);
    }

    public static void find_Max_Val(int arr[]) {

        if (arr.length < 1) {
            System.out.println(-1);
        }
        else{
        int count = 1, max = 0, max_val = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    max_val = arr[i];
                }
            }
            System.out.println(max +" : "+max_val);
        }}
    }
}