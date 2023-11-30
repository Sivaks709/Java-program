package equals;

public class Apple extends Object {

	// 11 NSM
	double price = 184;

	@Override
	public boolean equals(Object o) {
		System.out.println("Welcome to Apple Shop. " + o);
		// o contains Mango Address
		Mango ref = (Mango) o;
		if (this.price == ref.price)
			return true;
		else
			return false;
	}
}

class Mango {

	double price = 186;

	// 11 NSM
	@Override
	public boolean equals(Object o) {
		System.out.println("Welcome to Mango Shop. " + o);
		// Azzuming o contains Apple ref
		Apple ref = (Apple) o;
		if (this.price == ref.price)
			return true;
		else
			return false;
	}
}