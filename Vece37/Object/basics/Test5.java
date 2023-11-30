class Test5 
{
	static int a=15;
	static Test5 t=new Test5();
	public static void main(String[] args) 
	{
		//static Context
		t.demo();
	}
	public void demo()
	{
		//NSContext
		System.out.println(a);
		System.out.println(Test5.a);
		System.out.println(t.a);

	}
}
