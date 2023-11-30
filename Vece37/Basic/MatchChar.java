import java.util.Scanner;
class MatchChar
{
	static Scanner s=new Scanner(System.in);
	static public void main(String[] tabbu)
	{
		System.out.println("Enter The Character");
		char ch=s.next().charAt(0);//'K'
		if(ch=='A')
			System.out.println(ch+" : Is The Character Which is Entered");
		else if(ch=='B')
			System.out.println(ch+" : Is The Character Which is Entered");
		else if(ch=='C')
			System.out.println(ch+" : Is The Character Which is Entered");
		else
			System.out.println("Entered Character is In the Range of  D-Z");
	}
}