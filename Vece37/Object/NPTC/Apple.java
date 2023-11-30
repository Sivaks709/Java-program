class Fruit 
{
	String origin="India";
	String taste="Sweet";
}
class Apple extends Fruit
{
	String color="Red";
	double price=140;
	
	public static void main(String [] args)
	{
		//Upcasting 
		Fruit ref1=new Apple();
		//P->origin,taste,color,price;
		//comp->origin,taste       Acc to compil color and Price Not Present
		
		//	System.out.println(ref1.color); CTE
		//	System.out.println(ref1.price); CTE
		//Downcasting  (Going fr D.C To Access Child MEm)
		Apple ref2=(Apple)ref1;
		System.out.println(ref2.color);
		System.out.println(ref2.price);
		
	}
}
