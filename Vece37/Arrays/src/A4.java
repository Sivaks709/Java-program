//wajp to create an array of user wish size and store elements acc to user
import java.util.Scanner;

public class A4 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Size of Integer Array");
		int [] a=new int[s.nextInt()];//Array od user wish size is Created
		
		//Storeing the Element Loop is Designed
		for (int index = 0; index < a.length; index++) {
			//index->0........Length-1
			System.out.println("Enter The Elements a["+index+"]");
			a[index]=s.nextInt();
		}
		System.out.println("***************************");
		//For Printing the Elements
		for (int index = 0; index < a.length; index++) {
			System.out.println("a["+index+"]->"+a[index]);
		}
		
	}
}
