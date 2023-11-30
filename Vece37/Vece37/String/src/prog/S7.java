package prog;

public class S7 {

	static String res="";
	public static void main(String[] args) {
		String s1="Hi How Are You?";
		String s2[]=s1.split(" ");
		for (int index = s2.length-1; index >=0 ; index--) {
			res+=rev(s2[index])+" ";
		}
		System.out.println(res);
	}
	public static String rev(String str)
	{
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
}
