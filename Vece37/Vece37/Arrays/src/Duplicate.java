
public class Duplicate {

	public static void main(String[] args) {

		int a[]= {1,2,3,1,2,2,4,5,5};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j] && a[i]!=-38)
				{
					count++;
					a[j]=-38;
				}
			}
			if(count>1)
				System.out.println("The duplicate element is : "+a[i]+" : "+count);
		}
	}
}
