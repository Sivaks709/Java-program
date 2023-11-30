//Q.2  Rotation Program
import java.util.Scanner;

public class Rotation {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The N Value");
		int n=s.nextInt();
		int a[]= {1,2,3,4,5};
		System.out.println("a: [1,2,3,4,5]");
		System.out.println("For N value "+n);
		System.out.println("****************************");
		for (int i = 1; i <=n; i++) {
			
			int first=a[0];
			System.out.print("n-"+i+" : ");
			for (int index = 0; index < a.length-1; index++)
			{	a[index]=a[index+1];
		
				System.out.print(a[index]+" ");
			}
			a[a.length-1]=first;
			System.out.println(a[a.length-1]+" ");
		}
		
	}
}
