package equals;

public class Apple extends Object{

	//11 NSM
	double price=187;
	@Override
	public boolean equals(Object o)
	{
		//o contains Mango Address
		Mango ref=(Mango)o;
		if(this.price==ref.price)
			return true;
		else
			return false;
	}
}
class Mango{
	
	double price=187;
	//11 NSM
	@Override
	public boolean equals(Object o) {
		//Azzuming o contains Ap[ple ref
		Apple ref=(Apple)o;
		if(this.price==ref.price)
			return true;
		else
			return false;
	}
}