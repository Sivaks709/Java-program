package prog;

//Important 

public class Imp {

	public static void main(String[] args) {
		
		String s1="akAdzZeHMocB";
		char[] ch = s1.toCharArray();
		char []res=sorting(ch);
		ch=res;
		System.out.println("Input : "+s1);
	
			String u_case="",l_case="";
		//Helping to Seperate Uppercase and Lower CAse
			for (int index = 0; index <ch.length; index++) {
			if(ch[index]>='A' && ch[index]<='Z')
				u_case+=ch[index];
			else
				l_case+=ch[index];
		}
		String ans="";
		for (int index = 0,m=0,n=0; index < s1.length(); index++) {
			if(s1.charAt(index)>='A' && s1.charAt(index)<='Z')
			{
				ans+=u_case.charAt(m++);
			}
			else{
				ans+=l_case.charAt(n++);
			}
		}
		System.out.println("Output :"+ans);
		
	}
	//Bubble Sort
	public static char[] sorting(char[]ch)
	{
		char temp=' ';
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = 0; j < ch.length-1; j++) {
				if(ch[j]>ch[j+1])
				{
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println(ch);
		return ch;
	}
}

