class DriverMobile 
{
	static Mobile m;//Declaration of Obj ref va
	public static void main(String[] args) 
	{
		m=new Mobile("Qsp@123","Mi","Black",64);
		System.out.println("Initial Pin :"+m.getPin());
		m.setPin("Jsp@1234");
		System.out.println("After Modification :"+m.getPin());
		System.out.println("***********************************");
		System.out.println("The Mobile Name is :"+m.getName());
		System.out.println("Initial Mobile Color is :"+m.getColor());
		m.setColor("Gold");
				System.out.println("New  Mobile Color is :"+m.getColor());
	}
}
