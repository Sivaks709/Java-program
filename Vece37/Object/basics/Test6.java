class Test6 
{
	int a=5;
	static Test6 t=new Test6();
	public static void main(String[] args) 
	{
		//static context
		t.demo();
	}
	public void demo()
	{
		//NSContext
		System.out.println(a);
		System.out.println(t.a);
	}
}
