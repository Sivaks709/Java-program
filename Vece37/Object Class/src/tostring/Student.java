package tostring;

public class Student extends Object{

	int sid=12;
	String name="Bharath";
	String bst_frnd="Avinash";
	
	@Override
	public String toString()
	{
		return""+sid+":"+name+":"+bst_frnd;
	}
}
