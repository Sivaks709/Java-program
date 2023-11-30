class A 
{
	int a=10;
}
class B extends A
{
	int b=20;
}
class C extends B
{
	int c=30;
	
	public static void main(String []args)
	{
		A ref1=new B();
		//P-->a,b
		//com-->a
		//if i need to acces b Downcast to B type
		C ref2=(C)ref1;
	}
}