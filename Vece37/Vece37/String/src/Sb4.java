public class Sb4 {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Hello");
		StringBuilder sb2=new StringBuilder("Hello");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
