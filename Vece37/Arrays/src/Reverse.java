//Q2.Copy one Element into another in reverse order and perfrom even index sum
public class Reverse {

	public static void main(String[] args) {
		int a[]= {1,2,10,4,5};
		//create an resultant array of size equal to first array
		int res[]=new int[a.length];
		int sum=0;
		System.out.println("a:->1 2 3 4 5");
		System.out.println("**************************");
		for (int index = 0,m=a.length-1; index < res.length; index++,m--)
		{
			res[index]=a[m];
			if(index%2==0)
				sum+=res[index];	
			System.out.println("res["+index+"]->"+res[index]);
		}
		System.out.println("\n Total even index Sum :"+sum);
	}
}
