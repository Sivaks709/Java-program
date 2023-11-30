package prog;

public class S9 {

	public static void main(String[] args) {
		String s1="Hello";
		char ch[]=s1.toCharArray();
		int count=1;
		for (int i = 0; i < ch.length; i++) {
			count=1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>=1 && ch[i]!=' ')
				System.out.println(ch[i]+" : "+count);
		}
	}
}
