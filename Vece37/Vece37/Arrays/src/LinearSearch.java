import java.util.Scanner;
public class LinearSearch {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter The Key Element");
		int key=sc.nextInt();
		int []b= {4,6,2,3,8,9};
		System.out.println(linearSearch(b,key));
	}

	public static String linearSearch(int[] a,int key) {

		String res="Not Present";
		for (int index = 0; index < a.length; index++) {
			if(key==a[index])
			{
				res="Present";
				break;
			}
		}
		return res;
	}
}
