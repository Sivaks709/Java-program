//Blueprint
class Mobile 
{
	//states
	String name;
	String ram;
	double price;
	int storage;
	//Constructors Job--->(Loading the Obj and Ini DATA MEm)

	Mobile()
	{
		//L.i
	}
	Mobile(String n)
	{
		//L.I
		name=n;
	}
	Mobile(String n,String r)
	{
		//L.I
		name=n;
		ram=r;
	}
	Mobile(String n,String r,double p,int s)
	{
		//L.I
		name=n;
		ram=r;
		price=p;
		storage=s;
	}
	//Behaviours
	public void details()
	{
		System.out.println("The Mobile Name is :"+name);
		System.out.println("The Mobile Ram is :"+ram);
		System.out.println("The Mobile Price is :"+price);
		System.out.println("The Mobile Storage is :"+storage);
		System.out.println("*************************************");
	}
}
