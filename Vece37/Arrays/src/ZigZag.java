//Q.5 Zig Zag
public class ZigZag
{
	public static void main(String[] args)
	{
		int []a= {1,2,3,4,5};
		int[]b= {6,7,8,9,10};
		int [] res=new int[a.length+b.length];
		System.out.println("a->1 2 3 4 5");
		System.out.println("b->6 7 8 9 10");
		System.out.println("***********************************");
		for (int index = 0,m=b.length-1,n=0; index < res.length; index++)
		{
			if(index%2==0)
			{
				res[index]=a[n++];
			}
			else
			{
				res[index]=b[m--];
			}
			// Thread.sleep(399);
			System.out.print(res[index]+" ");
		}
	}
}
