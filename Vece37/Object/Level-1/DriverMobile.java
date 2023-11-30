//Mobile Obj
class DriverMobile 
{
	public static void main(String[] args) 
	{
		//Obj Creation Syntax
		Mobile mobile1=new Mobile();
		Mobile mobile2=new Mobile("Mi");
		Mobile mobile3=new Mobile("Oppo","8gb Ram");
		Mobile mobile4=new Mobile("Samsung","8gb ram",24000,120);
		mobile1.details();
		mobile2.details();
		mobile3.details();
		mobile4.details();
		

	}
}
