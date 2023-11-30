//Exception Handled
public class E3 {

	public static void main(String[] args) {
		System.out.println("Planned Start...");
		int []a= {1,2,3};
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(a[12]);//Abnormal Stmt JVM (AIOBE)
			System.out.println("Anil");
		}
		catch(ArithmeticException ref) {
			System.out.println("Can't Divide By 0");
		}
		catch (ArrayIndexOutOfBoundsException ref) {
			System.out.println("Lee Check The Index...");

		}
		System.out.println(3);
		System.out.println("Planned Stop");
		
	}
}


