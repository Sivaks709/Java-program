//Q4.Creating Student BluePrint
public class Student extends Object{

	//data mem
	String name;
	double marks;
	
	//const
	public Student()
		{
			super();
		}
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return""+name+" : "+marks+" ";
	}
	
	
	
	
	
}
