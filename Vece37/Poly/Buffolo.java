class Buffolo 
{
	Buffolo()
	{
		//L.I
	}
	Buffolo(String s)
	{
		//L.i
		System.out.println(s);
	}
	Buffolo(String s1,String s2)
	{
		//L.I
		System.out.println(s1);
		System.out.println(s2);
	}
	public static void main(String [] args)
	{
		System.out.println("My Cute Buffolo's");
		Buffolo ref=new Buffolo("Veda-15","Veda-16");
		System.out.println(ref);
	}

}
