//Q4.Collection of student and printing the failed syudents
public class Result {

	public static void main(String[] args) {
		Student a[]= {new Student("Avinash",95),new Student("Rajesh",99.9),new Student("Bharath",35),new Student("Tabrez",10)};
		// Object
		for (int index = 0; index < a.length; index++)
		{
			//downcast Bcz it is Upcasted Array
			Student s=(Student)a[index];
			if(s.marks<35)
			{
				System.out.println(a[index]);
			}
		}
	}
}
