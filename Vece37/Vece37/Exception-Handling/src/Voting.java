
public class Voting {

	public static void main(String[] args) {
		try {
			eligibility(8);
		} catch (Val5id e) {
			e.printStackTrace();// internally call getMessage
		} catch (NotValid e) {
			e.printStackTrace();// internally call getMessage
		}
	}

	public static void eligibility(int age) throws Val5id, NotValid {
		if (age >= 18)
			throw new Val5id();
		else
			throw new NotValid();
	}
}

class Val5id extends Exception {

	Val5id() {
		// L.i
	}

	@Override
	public String getMessage() {
		return "Eligible";
	}
}

class NotValid extends Exception {

	NotValid() {
		// L.i
	}

	@Override
	public String getMessage() {
		return "Not-Elibible";
	}
}