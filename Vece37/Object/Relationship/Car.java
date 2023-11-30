class Car 
{
	//states
	String name,color;
	double price;
	//Early Inst
	Engine e=new Engine("Diesel","1500","400");

	//Const
	Car(){}
	Car(String name,String color,double price)
	{
		//L.I
		this.name=name;
		this.color=color;
		this.price=price;
	}
	//Beh
	public void detailsOfCar()
	{
		//NSC
		System.out.println("The Car Name is :"+name);
		System.out.println("The Car Price is :"+this.price);
		System.out.println("The Car Color is :"+color);
		System.out.println("*********************************");
	}
	public void connecteToEngine()
	{
		e.detailsOfEngine();
	}


}
