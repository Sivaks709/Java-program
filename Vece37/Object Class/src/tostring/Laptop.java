package tostring;

public class Laptop extends Object {

	String name="Dell";
	double price=480000;
	//11NSM
	// @Override
	public String toString()
	{
		return ""+name+" : "+this.price;
	}
	public static void main(String[] args) {
		Object ref=new Laptop();
		System.out.println(ref);//.toString()
	}
}
