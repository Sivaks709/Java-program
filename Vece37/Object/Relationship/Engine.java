class Engine
{
	//states
	String type;
	String cc;
	int stroke=4;
	String power;
	//Const
	Engine(){}

	Engine(String type,String cc,String power)
	{
		//L.I
		this.type=type;
		this.cc=cc;
		this.power=power;
	}
	//Beh
	public void detailsOfEngine()
	{
		System.out.println("The Type of The Engine:"+this.type);
		System.out.println("The Cc of The Engine:"+cc);
		System.out.println("The Power of The Engine:"+this.power+" Hp");
		System.out.println("The Stroke of The Engine:"+stroke);
		System.out.println("**********************************************");
	}
}
