import java.util.Scanner;

public class BinarySearch { 

	static Scanner s = new Scanner(System.in);

	static String res="Not Present";
	public static void main(String[] args) {
		int []a= {7,8,54,45,25,23};
		System.out.println("Enter The Key Element");
		int key=s.nextInt();
		System.out.println(binarySearch(a, key));
	}
	public static String binarySearch(int []b,int key)
	{
		int lower=0,higher=b.length-1,mid;
		while(higher>=lower)
		{
			mid=(lower+higher)/2;
			if(key==b[mid])
			{
				res="Present";
				break;
			}
			else if(key>b[mid])
				lower=mid+1;
			else
				higher=mid-1;
		}
		return res;
	}
	
}
