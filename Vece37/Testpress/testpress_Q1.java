public class testpress_Q1 {
    public static void main(String[] args) {
        String s1 = "codeCode";
		String rev ="";
		for (int index = s1.length() - 1; index >= 0; index--){
            rev += s1.charAt(index);
        }
        System.out.println(rev.toLowerCase());
    }
}
