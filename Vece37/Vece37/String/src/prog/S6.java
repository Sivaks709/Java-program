package prog;

public class S6 {

	public static void main(String[] args) {
		String s1="Hi How Are You?";
		String []res=s1.split(" ");
		for (int index = res.length-1; index >=0; index--) {
			System.out.print(res[index]+" ");
		}
	}
}
