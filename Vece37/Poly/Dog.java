class Animal 
{
	String name;
	Animal()
	{}
	Animal(String name)
	{
		//L.I
		this.name=name;
	}
	public void sound()
	{
		System.out.println("Need to Be Overrided...");
	}
}
class Cat extends Animal
{
	Cat()
	{
		super("Cat...");
		//L.i
	}
	@Override
		public void sound()
		{
			System.out.println("Meow-Meow");
		}
} 
class Dog extends Animal
{
	Dog()
	{
		super("Dog...");
	}
		@Override
			public void sound()
			{
				System.out.println("Bow- Bow...");
			}
}

