
public class Duplicate {

	public static void main(String[] args) {

		int a[]= {1,2,3,1,1,0,4,5,0,2};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j] && a[i]!=-38)
				{
					count++;
					a[j]=-38;
				}
			}
			if(count>0)
				System.out.println("The duplicate element is : "+count+" : "+a[i]);
		}
	}
}
