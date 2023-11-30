package equals;

public class Driver {

	public static void main(String[] args) {
		Book ref1=new Book();
		Student ref2=new Student();
		if(ref1.hashCode()==ref2.hashCode())
			System.out.println("States are Same");
		else
			System.out.println("States are Not Same");
	}
}
