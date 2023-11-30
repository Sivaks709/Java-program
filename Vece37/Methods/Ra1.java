class Ra1 
{
	public static void main(String[] args) 
	{
		g1();
	}
	public static void g1()
	{
		System.out.println("Don't Under estmate the Power of The Commom Man");
		g1();
	}
}
/*
output
Exception in thread "main" java.lang.StackOverflowError
*/
