package equals;

public class DriverCar {

	public static void main(String[] args) {
		Car ref=new Car();
		Car ref1=new InnerCar();
		System.out.println(ref1.equals(ref));
		// System.out.println(ref.toString());
		// System.out.println(ref.hashCode());
	}
}
