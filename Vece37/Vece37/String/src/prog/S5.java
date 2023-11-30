package prog;

public class S5 {

	public static void main(String[] args) {
		String s1 = "hi Iam Spider";
		char[] ch = toCharArray(s1);// String is Converted into Character Array
		System.out.println(s1+"\n");
		for (int index = 0; index < ch.length; index++) {
			if (ch[index] == 'i' || ch[index] == 'a' || ch[index] == 'p' || ch[index] == 's' || ch[index] == 'r') {
				ch[index] = 'Q';
			}
			System.out.print(ch[index]);
		}
		
	

	}

	public static char[] toCharArray(String str) {
		char ch[] = new char[str.length()];
		for (int index = 0; index < str.length(); index++) {
			ch[index] = str.charAt(index);
		}
		return ch;
	}
}
