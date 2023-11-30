import java.util.Scanner;

//Q4.Nth Largest
public class NthLargest {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {8,9,2,62,3,4};
		int largest=a[0];
		System.out.println("Enter The N Value");
		int n=s.nextInt();
		System.out.println("8,9,2,62,3,4");
		for (int i = 1; i <=n;i++) {
			
			largest=a[0];
			for (int index = 0; index < a.length; index++) {
				if(a[index]>largest)
					largest=a[index];
			}
			for (int index = 0; index < a.length; index++) {
				if(a[index]==largest)
					a[index]=-1;
			}
		}
		System.out.println("The Nth Largest is : "+largest);
	}
}
