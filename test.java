// class Main {

//     public static void main(String[] args) {
//         String s="abcdef";
//         StringBuilder sb=new StringBuilder(s);
//         sb.reverse();
//         s=sb.toString();
//         System.out.println(s);
//     }
// }
class Main {

    public static void main(String[] args) {
        String s="abcdef";
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}