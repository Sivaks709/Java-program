
public class Palindrome {

	public static void main(String[] args) {
		String s1 = "OppO";
		String rev ="";
		for (int index = s1.length() - 1; index >= 0; index--)
			rev += s1.charAt(index);

		if (s1.equals(rev)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not Palindrome");
	}
}
}
