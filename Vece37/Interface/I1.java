interface I1
{
	public static void demo()
	{
		System.out.println("Hi Iam I1 Demo");
	}

}
interface I2
{
	public static void dinga()
	{
		System.out.println("Hi Iam I2 Demo");
	}

}
class C1 implements I1,I2
{
	public static void main(String [] arsg)
	{
		dinga();		
	}
}