package prog;

public class S2 {

	public static void main(String[] args) {
		String s1 = "Java";
		char []res=toCharArray(s1);
		System.out.println(res);
	}

	public static char[] toCharArray(String str) {
		char ch[] = new char[str.length()];
		for (int index = 0; index < str.length(); index++) {
				ch[index]=str.charAt(index);
		}
		return ch;
	}
}
