class Mobile 
{
	//states
	private String pin;
	private String  name,color;
	private int storage;
	//Const
	Mobile(){}

	Mobile(String pin,String name,String color,int storage)
	{
		//L.i
		this.pin=pin;
		this.name=name;
		this.color=color;
		this.storage=storage;
	}
	//Helper Methods
	public String getPin()
	{
		return pin;
	}
	public String getName()
	{
		return this.name;		
	}
	public String getColor()
	{
		return color;
	}
	public int getStorage()
	{
		return storage;
	}
	//Writable
	public void setPin(String new_pin)
	{
		this.pin=new_pin;
		System.out.println("Pin Modified Succesfully");
	}
	public void setColor(String new_color)
	{
		color=new_color;
		System.out.println("Color Modified...");
	}
	public void setStorage(int new_storage)
	{
		this.storage=new_storage;
	}
}
