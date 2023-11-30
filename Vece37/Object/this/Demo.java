class Demo 
{
	int a=45;
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test();//CTS
	}
	public void test()
	{
		System.out.println(a);
		System.out.println(this.a);
		
	}
}
