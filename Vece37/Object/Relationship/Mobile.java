class Mobile 
{
	//states
	String name;
	String ram;
	int storage;
	//Lazy Instantiation
	Sim slot;

	Mobile(){}

	Mobile(String name1,String ram1,int storage1)
	{
		//L.i
		name=name1;
		ram=ram1;
		storage=storage1;
	}
	//Behaviours
	public void insertSim(Sim s)
	{
		if(slot==null)
		{
			slot=s;
			System.out.println("Sim Inserted Succesfully...");
			//System.out.println(s);
		}
		else
			System.out.println("Sim is Already Present...");
	}
	public void removeSim()
	{
		if(slot!=null)
		{
			slot=null;//removeing sim 
			System.out.println("Sim Removed Succesfully..");
		}
		else
			System.out.println("Already Sim is Removed...");
	}
	public boolean isSimSlotEmpty()
	{
		if(slot!=null)
			return true;//Sim is Present
		else
			return false;//Sim is Not Present
	}
	public void detailsOfMobile()
	{
		System.out.println("Mobile Name :"+name);
		System.out.println("Mobile Total Ram :"+ram);
		System.out.println("Mobile Internal Storage :"+storage);
		System.out.println(""+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" ");
	}
}
