class Test4 
{
	 int a=10;//NSV
	static Test4 ref=new Test4();
	//constructors
	Test4()
	{
		//Load.In
		System.out.println("J 4 Joke I told u alaa");
	}
	public void demo()//NSM
	{
		System.out.println("Hi Iam Demo");
	}
	static{
		//Static context
		ref.demo();
		
	}
	
	//NSMLI
	{
		System.out.println("Hi Iam NSMLI");
	}

	public static void main(String[] args) 
	{
		//static Context
		
		System.out.println(ref.a);
		System.out.println("Bye");

	}
}
