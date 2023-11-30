package equals;

public class Book {

	double price=78;
	int id=12;
	String name="Java";//456454
	@Override
	public int hashCode()
	{
		return (int)price+id+name.hashCode();
	}
}
class Student {
	
	int sid=12;
	double marks=78;
	String name="James";
	@Override
	public int hashCode()
	{
		return sid+(int)marks+name.hashCode();
	}
	
}
