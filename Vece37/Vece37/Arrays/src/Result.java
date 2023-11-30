//Q4.Collection of student and printing the failed syudents
public class Result {

	public static void main(String[] args) {
		Object []a= {new Student("Avinash",98),new Student("Rajesh",99.5),new Student("Bharath",34),new Student("Tabrez",10)};
		
		for (int index = 0; index < a.length; index++) {
			
			//downcast Bcz it is Upcasted Array
			Student s=(Student)a[index];
			if(s.marks<35)
				System.out.println(a[index]);
		}
	}
}
