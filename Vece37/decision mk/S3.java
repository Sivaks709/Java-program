import java.util.*;
class S3
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Character..");
		char ch=s.next().charAt(0);//
		switch (ch)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(ch+" : is Vowel");
				break;
		default :System.out.println(ch+" : is Consonent");
		}
		System.out.println("Bye-Bye");
	}

}
