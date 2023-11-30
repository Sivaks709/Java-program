class Laptop 
{
	String name;
	private Laptop()
	{}
	private Laptop(String name)
	{
		//L.I
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Laptop lap1=new Laptop("Dell");
		Laptop lap2=new Laptop("Acer");
		System.out.println(lap1.name);
		System.out.println(lap2.name);
	}
}
