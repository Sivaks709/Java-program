
public class T1 {

	public static void main(String[] args) {
		try {
			throw new T2();
		}
		catch (T2 e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
class T2 extends Exception{
	public String getMessage()
	{
		return "Bye";
	}
}

