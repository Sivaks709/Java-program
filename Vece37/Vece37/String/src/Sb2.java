
public class Sb2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Cat siba");
		StringBuffer sb2=new StringBuffer();
		for (int index = sb1.length()-1; index >=0 ; index--) {
			sb2.append(sb1.charAt(index));
		}
		System.out.println(sb2);
	}

}