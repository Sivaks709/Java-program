import java.sql.SQLException;

public class Op2 {

	public static void main(String[] args) {
		System.out.println("Hi Iam Main");
		try {
		m1();
		}
		catch (Exception e) {
	
		e.printStackTrace();
		System.out.println("Handled in Main");
		}
		System.out.println("Bye From Main");
	}
	public static void m1() throws Exception
	{
		System.out.println("Hi Iam M1");
		m2();
		System.out.println("Bye Iam M1");
	}
	public static void m2()throws Exception
	{
		System.out.println("Hi Iam M2");
		m3();
		System.out.println("Bye From M2");
	}
	public static void m3()throws SQLException,NullPointerException
	{
		System.out.println("Hi Iam M3");
		throw new SQLException();
	}
}
