package prog;

public class S10 {

	public static void main(String[] args) {
		String s1="aaabbaac";
		char ch[]=s1.toCharArray();
		int count=1;
		for (int i = 0; i < ch.length-1; i++) {
			
			if(ch[i]==ch[i+1])
				count++;
			else {
				System.out.println(ch[i]+" : "+count);
				count=1;
			}
		}
		System.out.print(ch[ch.length-1]+" : "+count);
	}
}
