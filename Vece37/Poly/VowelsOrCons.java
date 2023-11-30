//Vowels or Consosnents using Switch
import java.util.Scanner;
class VowelsOrCons  
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Character...");
		char ch=s.next().charAt(0);
		switch (ch)
		{
		case 'A':System.out.println(1);
		case 'E':System.out.println(2);
		case 'I':System.out.println(3);
		case 'O':System.out.println(4);
		case 'U':System.out.println(5);
		
		}
	}
}
