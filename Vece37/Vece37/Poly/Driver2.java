class Driver2 
{
	public static void main(String[] args) 
	{
		Animal ref1=new Cat();
		ref1.sound();
		Animal ref2=new Dog();
		ref2.sound();
		System.out.println("************Names**********");
		System.out.println(ref1.name);
		System.out.println(ref2.name);

	}
}
