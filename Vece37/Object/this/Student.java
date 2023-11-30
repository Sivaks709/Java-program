//BluePrint
class Student 
{
	//states
	String name;
	String id;
	int marks;
	
	//constructers
	Student()
	{}
	Student(String name,String id,int marks)
	{
		//L.I
		this.name=name;//PWI
		this.id=id;
		this.marks=marks;
	}
	//Behaviours
	public void details()
	{
		System.out.println("The Student Name is :"+name);
		System.out.println("The Student Id is :"+this.id);
		System.out.println("The Student Marks is :"+marks);
		System.out.println("********************************");
	}

}
