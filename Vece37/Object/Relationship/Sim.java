class Sim 
{
	//states
	String op_name,band_width;
	long contact;
	double call_rate;

	//Const
	Sim(){}

	Sim(String op_name1,String band_width1,long contact1,double call_rate1)
	{
		//L.i
		op_name=op_name1;
		band_width=band_width1;
		contact=contact1;
		call_rate=call_rate1;
	}
	//Behaviours
	public void detailsOfSim()
	{
		System.out.println("Operator Name is :"+op_name);
		System.out.println("Band Width is :"+band_width);
		System.out.println("Contact is :"+contact);
		System.out.println("Call Rate  is :"+call_rate);
		System.out.println(""+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" ");
	}
}
