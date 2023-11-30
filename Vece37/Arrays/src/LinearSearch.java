import java.util.Scanner;
public class LinearSearch {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter The Key Element");
		int key=sc.nextInt();
		int []b= {4,6,0,3,8,9};
		System.out.println(linearSearch(b,key));
	}

	public static String linearSearch(int[] a,int key) {
		String res="Not Present";
		int count=0;
		for (int index = 0; index < a.length; index++) {
			if(key==a[index])
			{
				res="Present";
				count+=1;
			}
		}
		return key+" "+res+" "+count+" time...";
	}
}
