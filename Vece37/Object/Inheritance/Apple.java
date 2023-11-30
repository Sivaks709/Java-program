class Fruit 
{
	//NSV
	String origin;
	String taste;
	//Const

	Fruit()
	{
		//L.I	
	}
	Fruit(String origin,String taste)
	{
		//L.I
		this.origin=origin;//PWI
		this.taste=taste;//Pwi
	}

}
class Apple extends Fruit
{
	//NSV
	String name,color;
	//const
	Apple()
	{
		super();
		//L.I
	}
	Apple(String name,String color)
	{
		super("India","Sweet");
		//L.I
		this.name=name;
		this.color=color;
	}
}

